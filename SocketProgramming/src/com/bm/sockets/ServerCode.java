package com.bm.sockets;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerCode {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(8000); // PORT no defined by server
			// 1024 to 65535
			// 0 to 1023 : System reserved

			System.out.println("Server running...");
			Socket reciver = server.accept(); // Accept is a blocking call : Waits for client request
			DataInputStream din = new DataInputStream(reciver.getInputStream());

			String data = din.readUTF();
			System.out.println("Data:" + data);
//			reciver.close();
//			server.close();
			System.out.println("Server stopped");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
