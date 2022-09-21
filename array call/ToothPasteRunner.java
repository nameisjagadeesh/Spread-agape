class ToothPasteRunner{
	public static void main(String [] brushed)
	{
		
		System.out.println("started brushing the teeths");
		ToothPaste.name="miswak";
		ToothPaste.brand="sensodyne";
		ToothPaste.country="india";
		ToothPaste.type="gellypaste";
		ToothPaste.ingradients="salt";
		ToothPaste.flavours="fresh mint";
		ToothPaste.price=119;
		ToothPaste.weight=75.2;
		ToothPaste.width=2.3;
		ToothPaste.quantity=5;
		ToothPaste.seller="itc";
		ToothPaste.taste=true;
		ToothPaste.size='M';
		ToothPaste.material="sugar salt";
		ToothPaste.expirydate="aug2024";
		ToothPaste.printToothPasteDetails();
		
		String country=ToothPaste.getCountry();
		if(country=="amaerica")
		{
		System.out.println("the brand name is correct");	
		}
		else{
			System.out.println("the brand is not correct");
		}
		System.out.println("completed brushing the teeths");
	}
}
