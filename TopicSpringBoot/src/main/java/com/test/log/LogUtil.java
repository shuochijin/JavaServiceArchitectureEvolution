package com.test.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LogUtil {
	
	private static final Log log = LogFactory.getLog(LogUtil.class);
	
	public static void trace(String info){
		if(log.isTraceEnabled()){
			log.trace(info);
		}
	}
	public static void debug(String info){
		if(log.isDebugEnabled()){
			log.debug(info);
		}
	}
	public static void info(String info){
		if(log.isInfoEnabled()){
			log.info(info);
		}
	}
	public static void warn(String info){
		if(log.isWarnEnabled()){
			log.warn(info);
		}
	}
	public static void error(String info){
		if(log.isErrorEnabled()){
			log.error(info);
		}
	}
	public static void fatal(String info){
		if(log.isFatalEnabled()){
			log.fatal(info);
		}
	}
	
}
