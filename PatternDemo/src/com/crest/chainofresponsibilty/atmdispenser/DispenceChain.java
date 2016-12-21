package com.crest.chainofresponsibilty.atmdispenser;

public abstract class DispenceChain {
	
	public abstract void setNextChain(DispenceChain nextchain);
	
	public abstract void dispense(Ruppee rup);
	
	public Integer dispenceAndReturnRemainder(Ruppee rup, Integer currentdenimination){
	int num= rup.getAmount()/currentdenimination;
	System.out.println("Dispensing "+currentdenimination+" "+num+" times");
	return rup.getAmount()%currentdenimination;
	}
}
