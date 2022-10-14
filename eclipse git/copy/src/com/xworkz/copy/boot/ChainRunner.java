package com.xworkz.copy.boot;
//runner file of chain constructor chaining ,created instance using all constructor

import com.xworkz.copy.examples.Chain;

public class ChainRunner {

	public static void main(String[] args) {
		System.out.println("constructor chaining of chain ");
		Chain chain=new Chain("Gold");
		System.out.println(chain.type);
		
		System.out.println(System.lineSeparator());
		System.out.println("===chaining type and code===");
		Chain chain2=new Chain("Silver", 'S');
		System.out.println(chain2.type);
		System.out.println(chain2.code);
		
		System.out.println(System.lineSeparator());
		System.out.println("===chaining type ,price and code===");
		Chain chain3=new Chain("Silver", 'S',55254L);
		System.out.println(chain3.type);
		System.out.println(chain3.code);
		System.out.println(chain3.price);
		
		System.out.println(System.lineSeparator());
		System.out.println("===chaining type ,price,company and code===");
		Chain chain4=new Chain("diamond", 'D',654789L,"bhima");
		System.out.println(chain4.type);
		System.out.println(chain4.code);
		System.out.println(chain4.price);
		System.out.println(chain4.company);
		
		System.out.println(System.lineSeparator());
		System.out.println("====chaining type ,price,company,weightand code===");
		Chain chain5=new Chain("platinum", 'P',654859L,"malbar",25.3);
		System.out.println(chain5.type);
		System.out.println(chain5.code);
		System.out.println(chain5.price);
		System.out.println(chain5.company);
		System.out.println(chain5.weight);
		
		System.out.println(System.lineSeparator());
		System.out.println("===chaining type ,price,company,weight ,quantity and code");
		Chain chain6=new Chain("gold", 'P',654859L,"malbar",25.3,45);
		System.out.println(chain6.type);
		System.out.println(chain6.code);
		System.out.println(chain6.price);
		System.out.println(chain6.company);
		System.out.println(chain6.weight);
		System.out.println(chain6.quantity);
		
		System.out.println(System.lineSeparator());
		System.out.println("===chaining type and weight==");
		Chain chain7=new Chain("diamond", 2.6);
		System.out.println(chain7.type);
		System.out.println(chain7.weight);
		
		System.out.println(System.lineSeparator());
		System.out.println("===chaining type ,price ,quantity and code===");
		Chain chain8=new Chain("Silver", 'S',25454L,45);
		System.out.println(chain8.type);
		System.out.println(chain8.code);
		System.out.println(chain8.price);
		System.out.println(chain8.quantity);
		
		
		
		
		
		
	}

}
