package com.bm.cardverification;

//This is known as entity class
//AKA- VO (value object) /
// DTO (Data  Transfer Object) 
/// POJO (Plain Old Java Object) / Bean
public class Card {
	String name;
	String cardNo;
	String cvv;
	String expdate;

	public Card() {
	}

	public Card(String name, String cardNo, String cvv, String expdate) {

		this.name = name;
		this.cardNo = cardNo;
		this.cvv = cvv;
		this.expdate = expdate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public String getExpdate() {
		return expdate;
	}

	public void setExpdate(String expdate) {
		this.expdate = expdate;
	}

}
