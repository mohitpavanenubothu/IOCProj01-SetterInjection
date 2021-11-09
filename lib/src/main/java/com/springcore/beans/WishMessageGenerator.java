package com.springcore.beans;

import java.util.Date;

public class WishMessageGenerator {

	// Has-A property
	private Date date;

	public void setDate(Date date) {
		this.date = date;
	}

	// B.L
	public String generateMsg(String user) {
		System.out.println("WishMessageGenerator.generateMsg()::BL Logic method");
		int hours = date.getHours();
		if (hours < 12)
			return "Good Morning " + user;
		else if (hours < 16)
			return "Good Afternoon " + user;
		else if (hours < 20)
			return "Good Evening " + user;
		else
			return "Good Night " + user;
	}

}
