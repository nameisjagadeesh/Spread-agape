package com.xworkz.copy.constants;
//here passed the 'value' args in 'Code' references to declare char in enum 

public enum Codes {
	
	A('a'),B('b'),C('c'),D('d'),E('e'),F('f');
	
	public char value;

	private Codes(char value) {
		this.value = value;
	}
	
	

}
