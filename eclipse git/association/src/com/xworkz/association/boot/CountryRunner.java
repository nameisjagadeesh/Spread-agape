package com.xworkz.association.boot;

import com.xworkz.association.constants.Gender;
import com.xworkz.association.things.country.City;
import com.xworkz.association.things.country.Country;
import com.xworkz.association.things.country.President;
import com.xworkz.association.things.country.name;

public class CountryRunner {

	public static void main(String[] args) {
		Country country = new Country("India");
		President president = new President("narendra modi");
		president.setGender(Gender.MALE);
		president.setTotalVotes(651266446L);
		country.setPresident(president);
		

		name name1 = new name("jambu dweepa", "india", "dont know");
		City city = new City(name1);
		city.setAreaInSqKm(362);
		city.setCapital(true);

		name name2 = new name("bharat", "india", "dont know");
		City city2 = new City(name2);
		city2.setAreaInSqKm(653);
		city2.setCapital(false);

		City[] cities = { city, city2 };
		country.setCities(cities);

		country.display();
	}

}
