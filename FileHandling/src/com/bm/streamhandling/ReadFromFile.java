package com.bm.streamhandling;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadFromFile {

	public static void main(String[] args) {

		try {
			FileInputStream fin = new FileInputStream("employee.txt");
			BufferedInputStream bin = new BufferedInputStream(fin);
//			DataInputStream din = new DataInputStream(bin);
			ObjectInputStream oin = new ObjectInputStream(bin);
//			System.out.println("Data : " + din.readUTF());
//			Empoyee e1 = (Empoyee) oin.readObject();
			System.out.println("EMployee data : \n");
			while(true) {
				try {
					Empoyee e1 = (Empoyee) oin.readObject();
					System.out.println(e1);
				}catch(EOFException e) {
					break;
				}
				
			}
//			oin.close();
			bin.close();
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
