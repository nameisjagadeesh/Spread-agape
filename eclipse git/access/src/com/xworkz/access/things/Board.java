package com.xworkz.access.things;

public class Board {
	private String color = "black";
	public String name;
	private long totalWords = 6657612L;
	public String type;
	public boolean longetivity;
	private double width = 63;
	private String place="karnataka";
	public char code;
	public String boardName;
	public String headline;
	public int totalBoards;
	public Board(String name, String type, boolean longetivity, char code, String boardName, String headline,
			int totalBoards) {
		super();
		this.name = name;
		this.type = type;
		this.longetivity = longetivity;
		this.code = code;
		this.boardName = boardName;
		this.headline = headline;
		this.totalBoards = totalBoards;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public long getTotalWords() {
		return totalWords;
	}
	public void setTotalWords(long totalWords) {
		this.totalWords = totalWords;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	

}
