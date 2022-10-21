package com.xworkz.copy.constants;
//here passed the 'time' args in 'Type' references to declare string in enum 

public enum Type {
	WALL("gode"), TABLE("keep"), DIGITAL("smart"), ANALOG("thread");

	public String time; // this is the property of enum 'Type'

	private Type(String time) { // enum constructor declaration which should be private
		this.time = time;
	}

}
