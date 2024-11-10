package com.codegnan.customExceptions;

public class IncorrectPinException extends Exception {
	public  IncorrectPinException(String errorMsg){
		super(errorMsg);
		
	}

}
