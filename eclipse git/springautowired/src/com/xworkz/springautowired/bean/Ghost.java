package com.xworkz.springautowired.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ghost {
	@Value("annabbelle")
	private String name;
	@Value("6.3")
	private double height;
	@Value("white")
	private String color;
	@Value("humanGhost")
	private String type;
	@Value("true")
	private boolean scary;
	@Value("52.3")
	private double weight;
	@Value("7.3")
	private double nailSize;
	@Value("5")
	private int partners;
	@Value("prashant")
	private String partnerName;
	@Value("girl")
	private String gender;
	private double width;
	private String place;
	private double dressSize;
	private String father;
	private int killed;
	private String mother;
	private short friends;
	private String sibling;
	private double distance;
	private String husband;

	public Ghost(@Qualifier("widthOfGhost") double width, @Qualifier("placeOfGhost") String place,
			@Qualifier("dressOfGhost") double dressSize, @Qualifier("fatherOfGhost") String father,
			@Qualifier("killsOfGhost") int killed, @Qualifier("motherOfGhost") String mother,
			@Qualifier("friendsOfGhost") short friends, @Qualifier("silblingrOfGhost") String sibling,
			@Qualifier("distanceOfGhost") double distance, @Qualifier("husbandOfGhost") String husband) {
		super();
		this.width = width;
		this.place = place;
		this.dressSize = dressSize;
		this.father = father;
		this.killed = killed;
		this.mother = mother;
		this.friends = friends;
		this.sibling = sibling;
		this.distance = distance;
		this.husband = husband;
	}

	@Override
	public String toString() {
		return "Ghost [name=" + name + ", height=" + height + ", color=" + color + ", type=" + type + ", scary=" + scary
				+ ", weight=" + weight + ", nailSize=" + nailSize + ", partners=" + partners + ", partnerName="
				+ partnerName + ", gender=" + gender + ", width=" + width + ", place=" + place + ", dressSize="
				+ dressSize + ", father=" + father + ", killed=" + killed + ", mother=" + mother + ", friends="
				+ friends + ", sibling=" + sibling + ", distance=" + distance + ", husband=" + husband + "]";
	}

}
