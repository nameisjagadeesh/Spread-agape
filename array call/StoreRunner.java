class StoreRunner{
	public static void main(String [] kiranashop)
	{
		System.out.println("store open aytu");
		Store.shopName="iva grocery store";
		Store.ownerName="ivar";
		Store.location="bengaluru";
		Store.type="grocery";
		Store.sellingThings="allthings";
		Store.workerName="jhon";
		Store.revenue=12547;
		Store.shopLength=15.26;
		Store.shopWidth=6.35;
		Store.noOfShops=5;
		Store.costlyItem="shampoo";
		Store.cheap=false;
		Store.size='L';
		Store.country="india";
		Store.printStoreDetails();
		//initiated 2 set of properties in runner file
		Store.setShopName("shoppee+");
		Store.setOwnerName("akash");
		Store.setLocation("bijapur");
		Store.setType("creditshop");
		Store.setSellingThings("almostall");
		Store.setWorkerName("balu");
		Store.setRevenue(14686);
		Store.setShopLength(12.35);
		Store.setShopWidth(8.6);
		Store.setnoOfShops(4);
		Store.setCostlyItem("stationary");
		Store.setCheap(true);
		Store.setSize('m');
		Store.setCountry("bharat");
		Store.printStoreDetails();
		
		int revenue=Store.getRevenue();
		if(revenue>10000){
			System.out.println("revenue is very good");
		}
		else{
			System.out.println("revenue is not proffiting");
		}
		int noOfShops=Store.getNoOfShops();
		if(noOfShops<4){
			System.out.println("shop nos are less in numbers");
		}
		else{
			System.out.println("shop nos are more in numbers");
		}
		System.out.println("store close aytu");
	}
}