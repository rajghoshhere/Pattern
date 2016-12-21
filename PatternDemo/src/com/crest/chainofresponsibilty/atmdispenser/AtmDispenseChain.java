package com.crest.chainofresponsibilty.atmdispenser;

import java.util.Scanner;

public class AtmDispenseChain {
	DispenceChain c1;
	public AtmDispenseChain() {
		 c1=  new FiveHundredRupeeDispenser();
		DispenceChain c2 = new HundredRupeeDispenser();
		DispenceChain c3 = new FifityRupeeDispenser() ;
		c1.setNextChain(c2);
		c2.setNextChain(c3);
	}

	public static void main(String[] args) {
		
		AtmDispenseChain atmDis = new AtmDispenseChain();
		Scanner sc= new Scanner(System.in);
		
			try {
		
					Integer amount = sc.nextInt();
					if(amount%50!=0)
					{
									System.out.println(" Cannot Dispense less than 50");
									return;
					}
					atmDis.c1.dispense(new Ruppee(amount));
			} finally {
				sc.close();
			}
		}
	
	
		
		
	
}
