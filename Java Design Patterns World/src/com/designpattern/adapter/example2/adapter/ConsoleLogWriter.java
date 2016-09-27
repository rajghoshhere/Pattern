package com.designpattern.adapter.example2.adapter;

import com.designpattern.adapter.example2.console.ConsoleWriter;
import com.designpattern.adapter.example2.logger.LogWriter;

/**
 * 
 * @author Vaishali Karkhile
 * Adapter class with composition {@link ConsoleWriter}.
 */
public class ConsoleLogWriter implements LogWriter{

	/**
	 * Composition
	 */
	private ConsoleWriter consoldeWriter= new ConsoleWriter();
	
	@Override
	public void out(String text) {
		consoldeWriter.writeToConsole(text);
		
	}

}
