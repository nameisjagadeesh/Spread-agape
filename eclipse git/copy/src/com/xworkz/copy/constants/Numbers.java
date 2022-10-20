package com.xworkz.copy.constants;
//here passed the 'no and price' args in 'Number' references to declare int datatype in enum 

public enum Numbers {
	
	ONE(1,100),TWO(2,250),THREE(3,600),SIX(4,350),EIGHT(5,320),NINE(6,800);
	
	public int no;
	public int price;
	private Numbers(int no, int price) {
		this.no = no;
		this.price = price;
	}

	
	
	
	

}
