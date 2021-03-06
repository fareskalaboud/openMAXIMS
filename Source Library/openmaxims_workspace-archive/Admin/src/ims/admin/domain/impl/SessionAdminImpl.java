//#############################################################################
//#                                                                           #
//#  Copyright (C) <2014>  <IMS MAXIMS>                                       #
//#                                                                           #
//#  This program is free software: you can redistribute it and/or modify     #
//#  it under the terms of the GNU Affero General Public License as           #
//#  published by the Free Software Foundation, either version 3 of the       #
//#  License, or (at your option) any later version.                          # 
//#                                                                           #
//#  This program is distributed in the hope that it will be useful,          #
//#  but WITHOUT ANY WARRANTY; without even the implied warranty of           #
//#  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the            #
//#  GNU Affero General Public License for more details.                      #
//#                                                                           #
//#  You should have received a copy of the GNU Affero General Public License #
//#  along with this program.  If not, see <http://www.gnu.org/licenses/>.    #
//#                                                                           #
//#############################################################################
//#EOH
// This code was generated by John MacEnri using IMS Development Environment (version 1.39 build 2166.24836)
// Copyright (C) 1995-2005 IMS MAXIMS plc. All rights reserved.

package ims.admin.domain.impl;

import java.io.File;
import java.io.FileInputStream;
import java.text.ParseException;
import java.util.Locale;

import ims.admin.vo.AppSessionVo;
import ims.admin.vo.AppSessionVoCollection;
import ims.admin.vo.LogFileVo;
import ims.configuration.gen.ConfigFlag;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.impl.DomainImpl;
import ims.framework.cn.SessionManager;
import ims.framework.utils.DateTime;

public class SessionAdminImpl extends DomainImpl implements ims.admin.domain.SessionAdmin, ims.domain.impl.Transactional
{

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	private static final org.apache.log4j.Logger LocalLogger = ims.utils.Logging.getLogger(SessionAdminImpl.class);
	
	
	public AppSessionVoCollection listSessions()
	{
		AppSessionVoCollection voColl = new AppSessionVoCollection();
		String[] sessionStrs = null;

		sessionStrs = SessionManager.getSessions(getSession().getUser().getUsername(), getSession().getUser().getClearPassword());

		int arrCounter = 0;
		while (arrCounter < sessionStrs.length)
		{
			AppSessionVo vo = new AppSessionVo();

			vo.setSessionId(sessionStrs[arrCounter++]);
			vo.setUsername(sessionStrs[arrCounter++]);
			vo.setRealName(sessionStrs[arrCounter++]);
			vo.setRole(sessionStrs[arrCounter++]);
			
				try
				{
					String startTime = sessionStrs[arrCounter++];
					if(null==startTime)
					{
						vo.setStartTime(null);
					} else
					{
					vo.setStartTime(new DateTime(java.text.DateFormat.getDateTimeInstance(java.text.DateFormat.SHORT, java.text.DateFormat.SHORT,Locale.UK).parse(startTime)));
					}
				}
				catch (ParseException e)
				{
					
					vo.setStartTime(null);
					LocalLogger.warn("Failed to parse Start DateTime for session with ID: "+vo.getSessionId(),e);
				}
		
			vo.setIdleTime(Integer.valueOf(sessionStrs[arrCounter++]));
			vo.setTimeout(Integer.valueOf(sessionStrs[arrCounter++]));
			vo.setCurrentForm(sessionStrs[arrCounter++]);
			vo.setRemoteHost(sessionStrs[arrCounter++]);
			vo.setRemoteAddress(sessionStrs[arrCounter++]);
			vo.setIsLoggingEnabled(Boolean.valueOf(sessionStrs[arrCounter++]));
			vo.setNode(sessionStrs[arrCounter++]);
			voColl.add(vo);
		} 
		return voColl;
	}

	public void terminateSession(AppSessionVo vo)  throws DomainInterfaceException
	{
		SessionManager.endSession(vo.getSessionId(),getSession().getUser().getUsername(), getSession().getUser().getClearPassword());
	}

	public AppSessionVo toggleLogging(AppSessionVo vo) throws DomainInterfaceException
	{
		SessionManager.toggleLogging(vo.getSessionId(),getSession().getUser().getUsername(), getSession().getUser().getClearPassword());
		vo.setIsLoggingEnabled(!vo.getIsLoggingEnabled());
		return vo;
	}

	
	public LogFileVo getLogFile(AppSessionVo vo, Integer tailSize) throws DomainInterfaceException
	{
		LogFileVo ret = new LogFileVo();
		ret.setLocation(ConfigFlag.GEN.SESSION_LOG_LOCATION.getValue());
		String logFileName = "Ims_" + vo.getUsername() + "_" + vo.getSessionId() + ".log";
		ret.setLogContent(getLogFileContent(logFileName,tailSize.intValue()));
		ret.setFileName(logFileName);
		ret.setSize(Integer.valueOf(getLogFileSize(logFileName)));
		return ret;
	}

	
	
	// Copied from HttpAppSesson. In a cluster we can read the files on the local machine 
	// assuming of course they are stored in the common file system
	private int getLogFileSize(String logFileName)
	{
		if (logFileName == null || logFileName.equals(""))
		{
			return -1;
		}
		String fileLocation = ConfigFlag.GEN.SESSION_LOG_LOCATION.getValue();
		if (fileLocation.equals("")) return -1;
			
		fileLocation += ("/" + logFileName);
		File f = new File(fileLocation);
		if (!f.exists()) return -1;
		return (int)(f.length()/1024);
	}

	
	// Copied from HttpAppSesson. In a cluster we can read the files on the local machine 
	// assuming of course they are stored in the common file system
	private String getLogFileContent(String logFileName, int tailSize)
	{
		if (logFileName == null || logFileName.equals(""))
		{
			return "Log File Not Found.";
		}
		try
		{
			byte[] buffer = null;

			String fileLocation = ConfigFlag.GEN.SESSION_LOG_LOCATION.getValue();
			if (fileLocation.equals("")) return "No Session Log file location has been configured.";
			
			fileLocation += ("/" + logFileName);
			File f = new File(fileLocation);
			FileInputStream fi = new FileInputStream(f);
			int len = (int)f.length();

			//tailSize sent in in KB. Need to convert to bytes
			tailSize = tailSize * 1024;
			int bytesToRead = Math.min(len,tailSize);
			if (tailSize <= 0) bytesToRead = len;

			buffer = new byte[bytesToRead];
			fi.skip((long)len-bytesToRead);
			fi.read(buffer);
			fi.close();

			return new String(buffer);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return "Exception occurred reading log file. " + e.getMessage();
		}		
	}

}
