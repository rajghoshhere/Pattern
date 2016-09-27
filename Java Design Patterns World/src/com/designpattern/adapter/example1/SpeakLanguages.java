package com.designpattern.adapter;

import com.designpattern.adapter.hindi.HindiSpeaker;
import com.designpattern.adapter.hindi.IHindiLanguage;

public class SpeakLanguages {

	public static void main(String[] args) {
		IHindiLanguage hindiSpeaker = new HindiSpeaker("Hindi");
		hindiSpeaker.saySomething();
		hindiSpeaker = new HindiSpeaker("French");
		hindiSpeaker.saySomething();
		

	}

}
