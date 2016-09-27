package com.designpattern.adapter.example2;

import com.designpattern.adapter.example2.adapter.ConsoleLogWriter;
import com.designpattern.adapter.example2.adapter.ConsoleLogWriter2;
import com.designpattern.adapter.example2.logger.Logger;

public class RunAdapterDemo {

	public static void main(String[] args) {
		
		// Composition
		ConsoleLogWriter consoleLogWriter  = new ConsoleLogWriter();
		Logger logger = new Logger(consoleLogWriter);
		logger.write("Adapter using composition");
		
		// Inheritance
		ConsoleLogWriter2 consoleLogWriter2 = new ConsoleLogWriter2();
		Logger logger2 = new Logger(consoleLogWriter2);
		logger2.write("Adapter using inheritance");

	}

}
