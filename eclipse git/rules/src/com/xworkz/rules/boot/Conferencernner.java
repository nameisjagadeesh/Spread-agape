package com.xworkz.rules.boot;

import com.xworkz.rules.bridge.Conference;
import com.xworkz.rules.followers.ConferenceAttendees;

public class Conferencernner {

	public static void main(String[] args) {
		ConferenceAttendees attendees=new ConferenceAttendees();
		System.out.println(attendees.dressCode(0));
		System.out.println(attendees.flagCode(0));
		System.out.println(attendees.numbercode(0));
		System.out.println(attendees.placeCode(null));
		System.out.println(attendees.PinCodeCharecter(05));
		System.out.println("~~~~~~~~~~~~~~~~~~~~~");
		Conference attendees2=new ConferenceAttendees();
		System.out.println(attendees2.dressCode(0));
		System.out.println(attendees2.flagCode(0));
		System.out.println(attendees2.numbercode(0));
		System.out.println(attendees2.placeCode(null));
		System.out.println(attendees2.PinCodeCharecter(05));
	}

}
