package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collection.dto.AirportDTO;

public class AirportRunner {

	public static void main(String[] args) {
		AirportDTO airportDTO1=new AirportDTO("newyork airport", 12000, "USA");
		AirportDTO airportDTO2=new AirportDTO("kempegowda", 13650, "india");
		AirportDTO airportDTO3=new AirportDTO("rajivgandhi", 1900, "india");
		AirportDTO airportDTO4=new AirportDTO("chatrapati", 2000, "india");
		AirportDTO airportDTO5=new AirportDTO("adilede flights", 9000, "USA");
		
		Collection<AirportDTO> collection=new ArrayList<AirportDTO>();
		collection.add(airportDTO5);
		collection.add(airportDTO4);
		collection.add(airportDTO3);
		collection.add(airportDTO2);
		collection.add(airportDTO1);
		
		boolean equals=airportDTO1.equals(airportDTO2);
          System.out.println(equals);

		
	}

}
