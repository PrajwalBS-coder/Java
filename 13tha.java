

import java.io.*;
import java.net.*;
import java.util.Scanner;

class client
{
final static int ServerPort = 1234;

public static void main(String args[]) throws UnknownHostException, IOException
{
Scanner scn = new Scanner(System.in);

// getting localhost ip
InetAddress ip = InetAddress.getByName("localhost");

// establish the connection
Socket s = new Socket(ip, ServerPort);

// obtaining input and out streams
DataInputStream dis = new DataInputStream(s.getInputStream());
DataOutputStream dos = new DataOutputStream(s.getOutputStream());

// sendMessage thread
Thread sendMessage = new Thread(new Runnable()
{
	@Override
	public void run() {
		while (true) {
                        
                        Scanner scn = new Scanner(System.in);
			// read the message to deliver.
			String msg = scn.nextLine();
			
			try {
                InetAddress ip = InetAddress.getByName("localhost");
                Socket s = new Socket(ip, ServerPort);
                DataOutputStream dos = new DataOutputStream(s.getOutputStream());
                DataInputStream dis = new DataInputStream(s.getInputStream());
				// write on the output stream
				dos.writeUTF(msg);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
});

// readMessage thread
Thread readMessage = new Thread(new Runnable()
{
	@Override
	public void run() {

		while (true) {
			try {
                InetAddress ip = InetAddress.getByName("localhost");
                Socket s = new Socket(ip, ServerPort);
                DataOutputStream dos = new DataOutputStream(s.getOutputStream());
                DataInputStream dis = new DataInputStream(s.getInputStream());
				// read the message sent to this client
				String msg = dis.readUTF();
				System.out.println(msg);
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}
});

sendMessage.start();
readMessage.start();

}
}






