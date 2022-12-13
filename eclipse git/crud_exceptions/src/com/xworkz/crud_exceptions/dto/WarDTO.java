package com.xworkz.crud_exceptions.dto;

import java.time.LocalDateTime;

public class WarDTO extends AbstractAuditDTO {
	private String name;
	private String startedBy;
	private String startedWith;
	private LocalDateTime startedIn;
	private LocalDateTime endedIn;
	private String wonBy;
	private int noOfDeaths;

	@Override
	public String toString() {
		return "WarDTO [name=" + name + ", startedBy=" + startedBy + ", startedWith=" + startedWith + ", startedIn="
				+ startedIn + ", endedIn=" + endedIn + ", wonBy=" + wonBy + ", noOfDeaths=" + noOfDeaths
				+ ", toString()=" + super.toString() + "]";
	}

	public WarDTO(String name, String startedBy, String startedWith, LocalDateTime startedIn, LocalDateTime endedIn,
			String wonBy, int noOfDeaths) {
		super();
		this.name = name;
		this.startedBy = startedBy;
		this.startedWith = startedWith;
		this.startedIn = startedIn;
		this.endedIn = endedIn;
		this.wonBy = wonBy;
		this.noOfDeaths = noOfDeaths;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStartedBy() {
		return startedBy;
	}

	public void setStartedBy(String startedBy) {
		this.startedBy = startedBy;
	}

	public String getStartedWith() {
		return startedWith;
	}

	public void setStartedWith(String startedWith) {
		this.startedWith = startedWith;
	}

	public LocalDateTime getStartedIn() {
		return startedIn;
	}

	public void setStartedIn(LocalDateTime startedIn) {
		this.startedIn = startedIn;
	}

	public LocalDateTime getEndedIn() {
		return endedIn;
	}

	public void setEndedIn(LocalDateTime endedIn) {
		this.endedIn = endedIn;
	}

	public String getWonBy() {
		return wonBy;
	}

	public void setWonBy(String wonBy) {
		this.wonBy = wonBy;
	}

	public int getNoOfDeaths() {
		return noOfDeaths;
	}

	public void setNoOfDeaths(int noOfDeaths) {
		this.noOfDeaths = noOfDeaths;
	}

}
