package gui;

import java.net.*;
import java.io.*;
public class myserver {

	public static void main(String args[]) {
		try {
	    ServerSocket ss = new ServerSocket(800);
	    Socket s = ss.accept();
	    DataInputStream din = new DataInputStream(s.getInputStream());
	    DataOutputStream out = new DataOutputStream(s.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Server is started : ");
		String str="",str2="";
		while(!str.equals("stop")) {
			str=din.readUTF();
			System.out.println("Client is :"+str);
			str2 = br.readLine();
			out.writeUTF(str2);
			out.flush();
		}
		}
		catch(Exception e) {
		 System.out.println("Execption is generated"+e);
	    }	
	}
}
