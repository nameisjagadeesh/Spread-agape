package com.xworkz.copy.constants;
//here passed the 'value' args in 'Code' references to declare char in enum 

public enum Codes {
	
	A('a'),B('b'),C('c'),D('d'),E('e'),F('f');
	
	public char value;           //this is the property of enum Codes

	private Codes(char value) { //enum constructor declaration which should be private
		this.value = value;
	}
	
	

}
