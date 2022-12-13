package com.xworkz.crud_exceptions.dto;

public class IplDTO extends AbstractAuditDTO {

	private String ownerName;
	private String captainName;
	private String teamName;
	private double purse;
	private int noOfTrophies;
	private int noOfWins;
	private int noOfDefeats;

	@Override
	public String toString() {
		return "IplDTO [ownerName=" + ownerName + ", captainName=" + captainName + ", teamName=" + teamName + ", purse="
				+ purse + ", noOfTrophies=" + noOfTrophies + ", noOfWins=" + noOfWins + ", noOfDefeats=" + noOfDefeats
				+ "]";
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getCaptainName() {
		return captainName;
	}

	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public double getPurse() {
		return purse;
	}

	public void setPurse(double purse) {
		this.purse = purse;
	}

	public int getNoOfTrophies() {
		return noOfTrophies;
	}

	public void setNoOfTrophies(int noOfTrophies) {
		this.noOfTrophies = noOfTrophies;
	}

	public int getNoOfWins() {
		return noOfWins;
	}

	public void setNoOfWins(int noOfWins) {
		this.noOfWins = noOfWins;
	}

	public int getNoOfDefeats() {
		return noOfDefeats;
	}

	public void setNoOfDefeats(int noOfDefeats) {
		this.noOfDefeats = noOfDefeats;
	}

}
