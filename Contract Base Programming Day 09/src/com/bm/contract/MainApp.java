package com.bm.contract;

public class MainApp {
	public static void main(String[] args) {
//This is where  we need to create 
//		OracalConnector ref = new OracalConnector();
//		ref.connect();
		
		
		DBConnectivity 	ref = new OracalConnector();  //We can solve this problem by using Factory design Pattern 
//		DBConnectivity ref = new MysqlConnector(); // Here we still need to change class names 
		ref.connect();
		
	}
}
