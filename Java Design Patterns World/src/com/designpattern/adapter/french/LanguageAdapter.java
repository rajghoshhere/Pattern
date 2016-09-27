package com.designpattern.adapter.french;

public class LanguageAdapter implements IFrenchLanguage{

	IFrenchLanguage frenchSpeaker ;
	

	public LanguageAdapter(String language) {
		if(language.equals("French")){
			frenchSpeaker = new FrenchSpeaker();
		}
		
	}


	@Override
	public void saySomething() {
		System.out.println("I am using adapter for speaking french");
		frenchSpeaker.saySomething();;
	}
	

}
