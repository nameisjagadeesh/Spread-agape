package com.xworkz.copy.examples;
//this is by declaring parameters and passing argumets



	public class Boat {
		public String name;
		public String colour;
		public String companyname;
		public int type;
		public String owner;
		
		
		
		public Boat(String name, String colour, String comanyname, int type, String owner) {
			this.name = name;
			this.colour = colour;
			this.companyname = comanyname;
			this.type = type;
			this.owner = owner;
		}
		
		public Boat( String name,int type, String colour) {
			this.type = type;
			this.name = name;
			this.colour = colour;
		}


		public Boat(String name, String colour) {
			this.name = name;
			this.colour = colour;
		}

		public Boat(String companyname) {
			this.companyname = companyname;
		}

		public Boat(int type) {
			this.type = type;

		}

		public Boat(String owner, int type) {
			this.owner = owner;
			this.type = type;
		}

		public Boat(int type, String colour) {
			this.type = type;
			this.colour = colour;
		}

		

		public Boat(String owner, String colour, String name) {
			this.owner = owner;
			this.colour = colour;
			this.name = name;
		}

		public Boat(int type, String name, String colour) {
			this.type = type;
			this.name = name;
			this.colour = colour;
		}

	
}
