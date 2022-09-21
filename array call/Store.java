class Store{
   static String shopName;
   static String ownerName;
   static String location;
   static String type;
   static String sellingThings;
   static String workerName;
   static int revenue;
   static double shopLength;
   static double shopWidth;
   static int noOfShops;
   static String costlyItem;
   static boolean cheap;
   static char size;
   static String country;
   
      
   static void setShopName(String value)
   {
	   shopName=value;
   }
   static void setOwnerName(String value)
   {
	   ownerName=value;
   }
   static void setLocation(String value)
   {
	   location=value;
   }
   static void setType(String value)
   {
	   type=value;
   }
   static void setSellingThings(String value)
   {
	   sellingThings=value;
   }
  
   static void setWorkerName(String value)
   {
	   workerName=value;
   }
   static void setRevenue(int value)
   {
	   revenue=value;
   }
   static void setShopLength(double value)
   {
	   shopLength=value;
   }
   static void setShopWidth(double value)
   {
	   shopWidth=value;
   }
   static void setnoOfShops(int value)
   {
	   noOfShops=value;
   }
   static void setCostlyItem(String value)
   {
	   costlyItem=value;
   }
   static void setCheap(boolean value)
   {
	   cheap=value;
   }
   static void setSize(char value)
   {
	   size=value;
   }
   static void setCountry(String value)
   {
	   country=value;
   }
   
   static String getShopName()
   {
	   return shopName;
   }
   static String getOwnerName()
   {
	   return ownerName;
   }
   static String getLocation()
   {
	   return location;
   }
   static String getType()
   {
	   return type;
   }
   static String getSellingThings()
   {
	   return sellingThings;
   }
   static String getWorkerName()
   {
	   return workerName;
   }
   static int getRevenue()
   {	   
	   return revenue;
   }
   static double getShopLength()
   {
	   return shopLength;
   }
   static double getShopWidth()
   {
	   return shopWidth;
   }
   static int getNoOfShops()
   {
	   return noOfShops;
   }
   static char getSize()
   {
	   return size;
   }
   static String getCostlyItem()
   {
	   return costlyItem;
   }
   static boolean isCheap()
   {
	   return cheap;
   }
   static String getCountry()
   {
	   return country;
   }
   
   
   static void printStoreDetails()
   {
	   System.out.println(shopName);
	   System.out.println(ownerName);
	   System.out.println(location);
	   System.out.println(type);
	   System.out.println(sellingThings);
	   System.out.println(workerName);
	   System.out.println(revenue);
	   System.out.println(shopLength);
	   System.out.println(shopWidth);
	   System.out.println(noOfShops);
	   System.out.println(costlyItem);
	   System.out.println(cheap);
	   System.out.println(size);
	   System.out.println(country);
	   
   }
  
   
   
}