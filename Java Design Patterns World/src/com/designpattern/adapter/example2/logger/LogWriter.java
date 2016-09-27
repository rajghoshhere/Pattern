package com.designpattern.adapter.example2.logger;

import com.designpattern.adapter.example2.console.ConsoleWriter;

/**
 * 
 * @author Vaishali Karkhile
 * Interface having a method to write provided text as a string
 * 
 * If you take a close look, {@link ConsoleWriter} also has a method with similar implementation
 */
public interface LogWriter {
	
	public void out(String text);

}
