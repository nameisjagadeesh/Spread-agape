package com.xworkz.rules.boot;

import com.xworkz.rules.bridge.Meeting;
import com.xworkz.rules.followers.CompanyMeeting;

public class MeetingRunner {

	public static void main(String[] args) {
		Meeting meeting = new CompanyMeeting();
		System.out.println(meeting.meetingChief());
		System.out.println(meeting.meetingPlace());
		System.out.println(meeting.meetingGoal());
		System.out.println(meeting.meetingTargets());
		System.out.println(meeting.meetingTime());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		CompanyMeeting meeting2 = new CompanyMeeting();
		System.out.println(meeting2.meetingChief());
		System.out.println(meeting2.meetingPlace());
		System.out.println(meeting2.meetingGoal());
		System.out.println(meeting2.meetingTargets());
		System.out.println(meeting2.meetingTime());
	}

}
