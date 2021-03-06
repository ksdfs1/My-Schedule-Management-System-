package log;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class EventLogger {
	FileHandler filehandler;
	LogManager logmanager;
	Logger logger;
	
	public EventLogger(String fileName) {
		try {
			logmanager = LogManager.getLogManager();
			logger = logmanager.getLogger(Logger.GLOBAL_LOGGER_NAME);
			filehandler = new FileHandler(fileName, true);
			filehandler.setFormatter(new SimpleFormatter());
			logger.addHandler(filehandler);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void log(String logmessage) {  //문자열을 받아 log 파일에 기록하는 메소드
		logger.info(logmessage);
	}
}
