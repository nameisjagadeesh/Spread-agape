class ProductRunner{
	
	public static void main(String [] view)
	{
		//name type price quantity quality
		System.out.println("entered the view of products");
		System.out.println(" total products view :" +view.length);
		if(view.length>=4)
		{
		System.out.println("entered view details are good");	
		}
        else{
			System.out.println("entered view details are not enough");			
		}
        String thing=view[0];  //pizza
   		System.out.println("the name :"+thing);
		String price=view[1];  //150
		System.out.println("the price :"+price);
		int convertedPrice=Integer.parseInt(price);
		System.out.println("converted price is:"+convertedPrice);
		if(convertedPrice<=100)
		{
		System.out.println("entered price of product is reasonable");	
		}
		else
		{
		System.out.println("entered price of product is very costly");	
		}
		String type=view[2];  //chillie
		System.out.println("the type :"+type);
		String quantity=view[3];  //6
		System.out.println("the quantity :"+quantity);
		byte convertedQuantity=Byte.parseByte(quantity);
		System.out.println("converted quantity is:"+convertedQuantity);
		if(convertedQuantity<=16){
		System.out.println("entered quantity of product are sufficient");	
		}
		else{
		System.out.println("entered quantity of product are more");	
		}
		String quality=view[4]; //true or false
		System.out.println("the quality :"+quality);
		boolean convertedQuality=Boolean.parseBoolean(quality);
		System.out.println("converted quality is:"+convertedQuality);
		if(convertedQuality)
		{
		System.out.println("entered quality of product is good");	
		}
		else{
		System.out.println("entered quality of product is not good");	
		}
		
	}
}









