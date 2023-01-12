<<<<<<< HEAD
package com.xworkz.spring.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Season {
	private String name;
	private String startinMonth;
	private Double duration;

	public Season() {
		System.out.println("running season");
	}

	public String getName() {
		return name;
	}

	@Value("Spring")
	public void setName(String name) {
		this.name = name;
	}

	public String getStartinMonth() {
		return startinMonth;
	}

	@Value("october")
	public void setStartinMonth(String startinMonth) {
		this.startinMonth = startinMonth;
	}

	public Double getDuration() {
		return duration;
	}

	@Value("2")
	public void setDuration(Double duration) {
		this.duration = duration;
	}

}
=======
package com.xworkz.spring.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Season {
	private String name;
	private String startinMonth;
	private Double duration;

	public Season() {
		System.out.println("running season");
	}

	public String getName() {
		return name;
	}

	@Value("Spring")
	public void setName(String name) {
		this.name = name;
	}

	public String getStartinMonth() {
		return startinMonth;
	}

	@Value("october")
	public void setStartinMonth(String startinMonth) {
		this.startinMonth = startinMonth;
	}

	public Double getDuration() {
		return duration;
	}

	@Value("2")
	public void setDuration(Double duration) {
		this.duration = duration;
	}

}
>>>>>>> 70f14a1768c537cc2a80f7c209f7829cf6dc8834
