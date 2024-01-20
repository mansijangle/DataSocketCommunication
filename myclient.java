package mark;
import java.net.*;
import java.io.*;
public class myclient {

	public static void main(String args[]) {
		
		try {
	     Socket s = new Socket("127.0.0.1",800);
	     DataInputStream din = new DataInputStream(s.getInputStream());
	     DataOutputStream out = new DataOutputStream(s.getOutputStream());
	     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Client is started : ");
		 System.out.println("send the message");
	     String str="",str2="";
	     while(!str.equals("stop")) {
	    	 str = br.readLine();
	    	 out.writeUTF(str);
	    	 out.flush();
	    	 str2=din.readUTF();
	    	 System.out.println("Server say: "+str2);
	    	 
	     }
	   }
	catch(Exception e) {
		System.out.println("Exception is generated is "+e);
	}
		
}
}
