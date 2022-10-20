package com.xworkz.copy.constants;
//here passed the 'time' args in 'Type' references to declare string in enum 

public enum Type {
	WALL("gode"),TABLE("keep"),DIGITAL("smart"),ANALOG("thread");
	
	public String time;

	private Type(String time) {
		this.time = time;
	}
	
	

}
