package com.designpattern.adapter.hindi;

import com.designpattern.adapter.french.LanguageAdapter;

/**
 * 
 * @author Vaishali Karkhile
 *
 */
public class HindiSpeaker implements IHindiLanguage{
	String language ;
	public HindiSpeaker(String language) {
		
		this.language = language;
	}

	@Override
	public void saySomething() {
		LanguageAdapter adapter = new LanguageAdapter(language);
		if(language.equals("Hindi")){
			System.out.println("Saying something in Hindi");
		}
		else{
			adapter.saySomething();
		}
		
		

	}
	
	public void sayHelloInFrenchUsingAdapter(){
		
		
	}
	

}
