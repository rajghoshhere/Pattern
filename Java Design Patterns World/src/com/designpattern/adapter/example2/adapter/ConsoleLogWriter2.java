package com.designpattern.adapter.example2.adapter;

import com.designpattern.adapter.example2.console.ConsoleWriter;
import com.designpattern.adapter.example2.logger.LogWriter;

/**
 * 
 * @author Vaishali Karkhile
 * Adapter class with inheritance {@link ConsoleWriter}
 */
public class ConsoleLogWriter2 extends ConsoleWriter implements LogWriter{

	@Override
	public void out(String text) {
		writeToConsole(text);
		
	}
}
