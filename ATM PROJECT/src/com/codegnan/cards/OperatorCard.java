package com.codegnan.cards;

import com.codegnan.customExceptions.InsufficientBalanceException;
import com.codegnan.customExceptions.InsufficientMachineBalanceException;
import com.codegnan.customExceptions.NotAOperatorException;
import com.codegnan.interfaces.IATMService;
import com.codegnan.interfaces.InvalidAmountException;

public class OperatorCard implements IATMService  {
	private int pinNumber;
	private long id;
	private String name;
	private final String type="Operator";
	public OperatorCard(long idn, int pin, String name) {
		id = idn;
		pinNumber = pin;
		this.name = name;
	}
	@Override
	public String getUserType() throws NotAOperatorException {
		// TODO Auto-generated method stub
		return type;
	}

	@Override
	public double withdrawAmount(double withAmount)
			throws InvalidAmountException, InsufficientBalanceException, InsufficientMachineBalanceException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void depositAmount(double deptAmount) throws InvalidAmountException {
		
		
	}

	@Override
	public double checkAmountBalance() {
		
		return 0;
	}

	@Override
	public void changePinNumber(int pinNumber) {
		
		
	}

	@Override
	public int getPinNumber() {
		// TODO Auto-generated method stub
		return pinNumber;
	}

	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void decreaseChances() {
		
	}

	@Override
	public int getChances() {
		
		return 0;
	}

	@Override
	public void resetPinChances() {
		
	}

	@Override
	public void generateMiniStatement() {
		
	}
	@Override
	public double checkAccountBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

}