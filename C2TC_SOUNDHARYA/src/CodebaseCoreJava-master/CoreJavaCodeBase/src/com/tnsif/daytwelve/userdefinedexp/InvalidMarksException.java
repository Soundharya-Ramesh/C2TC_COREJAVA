//Program to define User defined exception class
package com.tnsif.daytwelve.userdefinedexp;

public class InvalidMarksException extends Exception{

	public InvalidMarksException() {
		super();
	}

	public InvalidMarksException(String message) {
		super(message);
	}

	
}