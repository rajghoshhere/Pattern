package com.designpattern.adapter.example2.logger;

public class Logger {
	
	/**
	 * This is using Composition. 
	 * Logger class has LogWriter interface so its constructor accepts objects of classes which implement interface {@link LogWriter}
	 * 
	 */
	
	LogWriter logWriter;	
	
	public Logger(LogWriter logWriter) {
		this.logWriter = logWriter;
	}

	public void write(String text){
		logWriter.out(text);
	}

}
