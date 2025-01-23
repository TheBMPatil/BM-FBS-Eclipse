package com.bm.cardverification;

// This is business logic component
public class CardVerificatrion {

	public boolean verify(Card cardObj) {

//		Connectivity conRef = new FileConnectivity();
		Connectivity conRef = new DatabaseConnectivity();
		return conRef.isValid(cardObj);

//		DatabaseConnectivity dbcon = new DatabaseConnectivity();
//		return dbcon.isCardPresent(cardObj);
	}

}
