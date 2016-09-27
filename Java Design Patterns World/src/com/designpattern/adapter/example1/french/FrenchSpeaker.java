package com.designpattern.adapter.french;

/**
 * 
 * @author Vaishali Karkhile
 *
 */
public class FrenchSpeaker implements IFrenchLanguage{

	@Override
	public void saySomething() {
		System.out.println("Saying hello in French");
		
	}

}
