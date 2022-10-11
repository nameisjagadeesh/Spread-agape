package com.xworkz.copy.boot;
import com.xworkz.copy.examples.*;

public class DistrictCollectorRunner {
	public static void main(String[] args) {
		
		DistrictCollector nam=new DistrictCollector();
		System.out.println(nam.name);
		nam.name="Jagadeesh";
		System.out.println("the collector name is :"+nam.name);
		
		DistrictCollector years =new DistrictCollector();
		System.out.println(years.age);
		years.age=29;
		System.out.println("the age of DistrictCollector is :"+years.age);
		
		DistrictCollector dist=new DistrictCollector();
		System.out.println(dist.district);
		dist.district="Vijayapura";
		System.out.println("the district is :"+dist.district);
		
		DistrictCollector no=new DistrictCollector();
		System.out.println(no.batch);
		no.batch=51;
		System.out.println("the batch no is"+no.batch);
	}

}
