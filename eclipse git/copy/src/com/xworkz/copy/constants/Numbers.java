package com.xworkz.copy.constants;
//here passed the 'no and price' args in 'Number' references to declare int datatype in enum 

public enum Numbers {
	
	ONE(1,100),TWO(2,250),THREE(3,600),SIX(6,350),EIGHT(8,320),NINE(9,800);
	
	public int no;      // this is the property of enum 'Numbers'
	public int price;    // this is the property of enum 'Numbers'
	private Numbers(int no, int price) {  // enum constructor declaration which should be private
		this.no = no;
		this.price = price;
	}

	
	
	
	

}
