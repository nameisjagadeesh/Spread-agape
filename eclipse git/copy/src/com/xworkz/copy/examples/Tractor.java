<<<<<<< HEAD
package com.xworkz.copy.examples;
//propgraming on constructor chaining =super and this chaining

public class Tractor {
     public String name;
     public String brand;
     public long price;
     public double weight;
     public char model;
     
     public Tractor() {
    	 System.out.println("super chaining of Tractor constructor");
    	    	 
     }
     public Tractor(String name) {
    	 this();   //this is super chaining
    	 this.name=name;
     }
     public Tractor(String name,long price) {
    	 this(name);  //this is this chaining
    	 this.price=price;
     }
     public Tractor(String name,long price,String brand) {
    	 this(name,price);
    	 this.brand=brand;
     }
     public Tractor(String name,long price,String brand,double weight) {
    	 this(name,price,brand);
    	 this.weight=weight;
     }
     public Tractor(String name,long price,String brand,double weight,char model) {
    	 this(name,price,brand,weight);
    	 this.model=model;
    	 
     }
     public Tractor(long price,double weight) {
    	 this.price=price;
    	 this.weight=weight;
     }
}
=======
package com.xworkz.copy.examples;
//propgraming on constructor chaining =super and this chaining

public class Tractor {
     public String name;
     public String brand;
     public long price;
     public double weight;
     public char model;
     
     public Tractor() {
    	 System.out.println("super chaining of Tractor constructor");
    	    	 
     }
     public Tractor(String name) {
    	 this();   //this is super chaining
    	 this.name=name;
     }
     public Tractor(String name,long price) {
    	 this(name);  //this is this chaining
    	 this.price=price;
     }
     public Tractor(String name,long price,String brand) {
    	 this(name,price);
    	 this.brand=brand;
     }
     public Tractor(String name,long price,String brand,double weight) {
    	 this(name,price,brand);
    	 this.weight=weight;
     }
     public Tractor(String name,long price,String brand,double weight,char model) {
    	 this(name,price,brand,weight);
    	 this.model=model;
    	 
     }
     public Tractor(long price,double weight) {
    	 this.price=price;
    	 this.weight=weight;
     }
}
>>>>>>> 73e3ac50b998c155a9026ab9aa427423a7b8d4ad
