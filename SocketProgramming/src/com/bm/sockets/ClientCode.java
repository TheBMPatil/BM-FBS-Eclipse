package com.bm.sockets;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientCode {

	public static void main(String[] args) {
		try {
			String message = "Client says : wassup";
			Socket sender = new Socket(InetAddress.getByName("localhost"), 8000);

			DataOutputStream dos = new DataOutputStream(sender.getOutputStream());
			dos.writeUTF(message);

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
