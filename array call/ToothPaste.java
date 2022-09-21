class ToothPaste{
   static String name;
   static String brand;
   static String country;
   static String type;
   static String ingradients;
   static String flavours;
   static int price;
   static double weight;
   static double width;
   static int quantity;
   static String seller;
   static boolean taste;
   static char size;
   static String material;
   static String expirydate;
   
   static void setName(String value)
   {
	   name=value;
   }
   static void setBrand(String value)
   {
	   brand=value;
   }
   static void setCountry(String value)
   {
	   country=value;
   }
   static void setType(String value)
   {
	   type=value;
   }
   static void setIngradient(String value)
   {
	   ingradients=value;
   }
   static void setFlavours(String value)
   {
	   flavours=value;
   }
  
   static void setPrice(int value)
   {
	   price=value;
   }
   static void setWeight(double value)
   {
	   weight=value;
   }
   static void setWidth(double value)
   {
	   width=value;
   }
   static void setQuantity(int value)
   {
	   quantity=value;
   }
   static void setMaterial(String value)
   {
	   material=value;
   }
   static void setSeller(String value)
   {
	   seller=value;
   }
   static void setTaste(boolean value)
   {
	   taste=value;
   }
   static void setSize(char value)
   {
	   size=value;
   }
   
   static String getName()
   {
	   return name;
   }
   static String getBrand()
   {
	   return brand;
   }
   static String getCountry()
   {
	   return country;
   }
   static String getType()
   {
	   return type;
   }
   static String getIngradient()
   {
	   return ingradients;
   }
   static String getFlovours()
   {
	   return flavours;
   }
   static int getPrice()
   {
	   
	   return price;
   }
   static double getWeight()
   {
	   return weight;
   }
   static double getWidth()
   {
	   return width;
   }
   static int getQuantity()
   {
	   return quantity;
   }
   static char getSize()
   {
	   return size;
   }
   static String getSeller()
   {
	   return seller;
   }
   static boolean isTaste()
   {
	   return taste;
   }
   static String getMaterial()
   {
	   return material;
   }
   static String getExpirydate()
   {
	   return expirydate;
   }
   
   static void printToothPasteDetails()
   {
	   System.out.println(name);
	   System.out.println(brand);
	   System.out.println(country);
	   System.out.println(type);
	   System.out.println(ingradients);
	   System.out.println(flavours);
	   System.out.println(price);
	   System.out.println(weight);
	   System.out.println(width);
	   System.out.println(quantity);
	   System.out.println(seller);
	   System.out.println(taste);
	   System.out.println(size);
	   System.out.println(material);
	   System.out.println(expirydate);
   }
  
   
   
}