<<<<<<< HEAD
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
=======
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
>>>>>>> 820a8503d9b28a89c5c7c2077ec37760b56a3e84
