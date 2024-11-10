package com.codegnan.interfaces;

import com.codegnan.customExceptions.InsufficientBalanceException;
import com.codegnan.customExceptions.InsufficientMachineBalanceException;
import com.codegnan.customExceptions.InvalidAmountException;
import com.codegnan.customExceptions.NotAOperatorException;

public interface IATMService {
	// to get user type.whether the user is operator or normal  user.
	public abstract String getUserType()throws NotAOperatorException;
	
	public abstract double withdrawAmount(double wthdrawAmount)throws InvalidAmountException,InsufficientBalanceException,InsufficientMachineBalanceException, com.codegnan.interfaces.InvalidAmountException;
	
	public abstract void depositAmount(double dptAmount)throws InvalidAmountException, com.codegnan.interfaces.InvalidAmountException;
	
	//checkbalance
	
	public abstract double checkAccountBalance();
	
	// change pin number
	public abstract void changePinNumber(int pinNumber);
	
	public abstract int getPinNumber();
	
	//to get the username
	public abstract String getUserName();
	
	//to dectrese the no.of chances while enter the wrong pin number
	public abstract void decreaseChances();
	
	
	public abstract int getChances();
	// to reset the pin number chances by bank operator
	
	public abstract void resetPinChances();
	
	// to generate mini statements
	public abstract void generateMiniStatement();

	double checkAmountBalance();

}
