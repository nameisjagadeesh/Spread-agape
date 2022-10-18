<<<<<<< HEAD
package com.xworkz.copy.boot;

import com.xworkz.copy.examples.TextileShop;

public class TextileShopRunner {

	public static void main(String[] args) {
		System.out.println("constructor chaining");
		TextileShop shop=new TextileShop("pothys");
		System.out.println(shop.name);
		
		System.out.println(System.lineSeparator());
		System.out.println("====chaining name and shopCode");
		TextileShop code=new TextileShop("trends", 'b');
		System.out.println(code.name);
		System.out.println(code.shopCode);
		
		System.out.println(System.lineSeparator());
		System.out.println("====chaining name ,number and shopCode");
		TextileShop shop2=new TextileShop("pantloons", 'C', 2);
		System.out.println(shop2.name);
		System.out.println(shop2.shopCode);
		System.out.println(shop2.number);
		
		System.out.println(System.lineSeparator());
		System.out.println("====chaining name ,number, adressand shopCode ,");
		TextileShop shop3=new TextileShop("pantloons", 'C', 2,"lulumall");
		System.out.println(shop3.name);
		System.out.println(shop3.shopCode);
		System.out.println(shop3.number);
		System.out.println(shop3.adress);
		
		System.out.println(System.lineSeparator());
		System.out.println("====chaining name ,number,shopCode ,adress and totalvalue");
		TextileShop shop4=new TextileShop("pantloons", 'C', 2,"lulumall",654521L);
		System.out.println(shop4.name);
		System.out.println(shop4.shopCode);
		System.out.println(shop4.number);
		System.out.println(shop4.adress);
		System.out.println(shop4.totalValue);
		
		System.out.println(System.lineSeparator());
		System.out.println("====chaining name and totalvalue");
		TextileShop shop5=new TextileShop("aravind",9548756L );
		System.out.println(shop5.name);
		System.out.println(shop5.totalValue);
		
		System.out.println(System.lineSeparator());
		System.out.println("====chaining name ,adress and shopCode");
		TextileShop shop6=new TextileShop('C',"pantloons",  "magadiRoad");
		System.out.println(shop6.name);
		System.out.println(shop6.shopCode);
		System.out.println(shop6.adress);
		
		System.out.println(System.lineSeparator());
		System.out.println("====chaining number and totalvalue");
		TextileShop shop7=new TextileShop(128756L,56);
		System.out.println(shop7.number);
		System.out.println(shop7.totalValue);
		
		
		
		
		
		
		
		
	}

}
=======
package com.xworkz.copy.boot;

import com.xworkz.copy.examples.TextileShop;

public class TextileShopRunner {

	public static void main(String[] args) {
		System.out.println("constructor chaining");
		TextileShop shop=new TextileShop("pothys");
		System.out.println(shop.name);
		
		System.out.println(System.lineSeparator());
		System.out.println("====chaining name and shopCode");
		TextileShop code=new TextileShop("trends", 'b');
		System.out.println(code.name);
		System.out.println(code.shopCode);
		
		System.out.println(System.lineSeparator());
		System.out.println("====chaining name ,number and shopCode");
		TextileShop shop2=new TextileShop("pantloons", 'C', 2);
		System.out.println(shop2.name);
		System.out.println(shop2.shopCode);
		System.out.println(shop2.number);
		
		System.out.println(System.lineSeparator());
		System.out.println("====chaining name ,number, adressand shopCode ,");
		TextileShop shop3=new TextileShop("pantloons", 'C', 2,"lulumall");
		System.out.println(shop3.name);
		System.out.println(shop3.shopCode);
		System.out.println(shop3.number);
		System.out.println(shop3.adress);
		
		System.out.println(System.lineSeparator());
		System.out.println("====chaining name ,number,shopCode ,adress and totalvalue");
		TextileShop shop4=new TextileShop("pantloons", 'C', 2,"lulumall",654521L);
		System.out.println(shop4.name);
		System.out.println(shop4.shopCode);
		System.out.println(shop4.number);
		System.out.println(shop4.adress);
		System.out.println(shop4.totalValue);
		
		System.out.println(System.lineSeparator());
		System.out.println("====chaining name and totalvalue");
		TextileShop shop5=new TextileShop("aravind",9548756L );
		System.out.println(shop5.name);
		System.out.println(shop5.totalValue);
		
		System.out.println(System.lineSeparator());
		System.out.println("====chaining name ,adress and shopCode");
		TextileShop shop6=new TextileShop('C',"pantloons",  "magadiRoad");
		System.out.println(shop6.name);
		System.out.println(shop6.shopCode);
		System.out.println(shop6.adress);
		
		System.out.println(System.lineSeparator());
		System.out.println("====chaining number and totalvalue");
		TextileShop shop7=new TextileShop(128756L,56);
		System.out.println(shop7.number);
		System.out.println(shop7.totalValue);
		
		
		
		
		
		
		
		
	}

}
>>>>>>> 73e3ac50b998c155a9026ab9aa427423a7b8d4ad
