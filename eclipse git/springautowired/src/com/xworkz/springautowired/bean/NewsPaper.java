package com.xworkz.springautowired.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NewsPaper {
	@Value("vji43@gh")
	private String id;
	private String name;
	private String publisherName;
	@Value("kannada")
	private String language;
	private double price;

	@Autowired
	public NewsPaper(@Qualifier("nameOfNewsPaper") String name,
			@Qualifier("publisherNameOfNewsPaper") String publisherName) {
		super();
		this.name = name;
		this.publisherName = publisherName;
	}

	@Value("10.0")
	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "NewsPaper [id=" + id + ", name=" + name + ", publisherName=" + publisherName + ", language=" + language
				+ ", price=" + price + "]";
	}

}
