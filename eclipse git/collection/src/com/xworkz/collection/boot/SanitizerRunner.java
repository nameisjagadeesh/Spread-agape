package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collection.dto.SanitizerDTO;

public class SanitizerRunner {

	public static void main(String[] args) {
		SanitizerDTO sanitizerDTO1 = new SanitizerDTO("co12", "serum", "india", 870D);
		SanitizerDTO sanitizerDTO2 = new SanitizerDTO("cob5", "barathBiotech", "india", 800D);
		SanitizerDTO sanitizerDTO3 = new SanitizerDTO("cob172", "punes pvt ltd", "india", 1870D);
		SanitizerDTO sanitizerDTO4 = new SanitizerDTO("cou192", "barathBiotech", "bharat", 670D);
		SanitizerDTO sanitizerDTO5 = new SanitizerDTO("cor152", "serum", "india", 650D);
		SanitizerDTO sanitizerDTO6 = new SanitizerDTO("cokh12", "barathBiotech", "bharat", 170D);
		SanitizerDTO sanitizerDTO7 = new SanitizerDTO("coer102", "govt", "india", 870D);
		SanitizerDTO sanitizerDTO8 = new SanitizerDTO("cooi138", "barathBiotech", "india", 980D);
		SanitizerDTO sanitizerDTO9 = new SanitizerDTO("cosd125", "serum", "india", 210D);
		SanitizerDTO sanitizerDTO10 = new SanitizerDTO("cord12", "barathBiotech", "india", 352D);

		Collection<SanitizerDTO> collection = new ArrayList<SanitizerDTO>();
		collection.add(sanitizerDTO10);
		collection.add(sanitizerDTO9);
		collection.add(sanitizerDTO8);
		collection.add(sanitizerDTO7);
		collection.add(sanitizerDTO6);
		collection.add(sanitizerDTO5);
		collection.add(sanitizerDTO4);
		collection.add(sanitizerDTO3);
		collection.add(sanitizerDTO2);
		collection.add(sanitizerDTO1);

		Iterator<SanitizerDTO> ref1 = collection.iterator();
		while (ref1.hasNext()) {
			SanitizerDTO element = ref1.next();
			// System.out.println(element);
			if (element.getPrice() > 25) {
				System.out.println("sanitizsers of price 25 or above " + element);
			}
		}
		Iterator<SanitizerDTO> ref2 = collection.iterator();
		while (ref2.hasNext()) {
			SanitizerDTO element2 = ref2.next();
			if (element2 != null) {
				System.out.println("no element is null" + element2);

			}
		}
		Iterator<SanitizerDTO> ref3 = collection.iterator();
		while (ref3.hasNext()) {
			SanitizerDTO element3 = ref3.next();
			if (element3.getProducedBy().matches("serum")) {
				ref3.remove();
				System.out.println("removed elements  " + element3);

			}
		}
		Iterator<SanitizerDTO> ref4 = collection.iterator();
		while (ref4.hasNext()) {
			SanitizerDTO element4 = ref4.next();
			if (element4.getPrice() < 175) {
				System.out.println("shortest priced sanitizer  " + element4);
				// ref4.getClass();
			}
		}
		Iterator<SanitizerDTO> ref5 = collection.iterator();
		while (ref5.hasNext()) {
			SanitizerDTO element5 = ref5.next();
			if (element5.getPrice() > 1000) {
				System.out.println("max priced sanitizer  " + element5);
				// ref4.getClass();
			}
		}
		Iterator<SanitizerDTO> ref6 = collection.iterator();
		while (ref6.hasNext()) {
			SanitizerDTO element6 = ref6.next();
			if (element6.getPrice() > 900) {
				System.out.println("2nd max priced sanitizer  " + element6);
			}
		}

	}

}
