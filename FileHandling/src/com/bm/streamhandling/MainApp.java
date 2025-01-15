package com.bm.streamhandling;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainApp {
	public static void main(String[] args) {

		Empoyee emp = new Empoyee(1, "Ajay", 23400);
		Empoyee emp1 = new Empoyee(2, "Ajay", 23400);
		Empoyee emp2 = new Empoyee(3, "Ajay", 23400);
		Empoyee emp3 = new Empoyee(4, "Ajay", 23400);
		System.out.println("We'll do file handling today...!");

		FileOutputStream fout;
		try {
//			String myData = "This is a UTF : Universal text format ";
			fout = new FileOutputStream("employee.txt", true); // Second param : Append flag by default false
			BufferedOutputStream bout = new BufferedOutputStream(fout);
//			DataOutputStream dout = new DataOutputStream(bout);
			ObjectOutputStream objout = new ObjectOutputStream(bout);
//			AppendableObjectOutputStream objout=new AppendableObjectOutputStream(bout);
//			fout.write(10);
			objout.writeObject(new Empoyee(6,"Bhagwat",45000));
//			objout.writeObject(emp1);
//			objout.writeObject(emp2);
//			objout.writeObject(emp3);

//			byte[] dataArr = myData.getBytes(); // Coverting string into byte array

//			dout.writeUTF(myData);
//			dout.writeInt(1231312);
			// fout.write(dataArr);
			bout.close();
			fout.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
