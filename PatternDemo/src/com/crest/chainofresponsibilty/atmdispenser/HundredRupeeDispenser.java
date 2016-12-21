package com.crest.chainofresponsibilty.atmdispenser;

public class HundredRupeeDispenser extends DispenceChain {
	
	private DispenceChain chain;

	@Override
	public void setNextChain(DispenceChain chain) {
		
		this.chain=chain;
	}

	@Override
	public void dispense(Ruppee rup) {
		if (rup.getAmount()>=100)
		{
			Integer remainder = dispenceAndReturnRemainder(rup, 100);
			if(remainder!=0){
				this.chain.dispense(new Ruppee(remainder));
			}
		}
		else{
			this.chain.dispense(rup);
		}
	}

}
