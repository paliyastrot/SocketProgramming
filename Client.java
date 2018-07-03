import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client
{
	public static void main(String args[]) throws UnknownHostException, IOException
	{
		Scanner scan = new Scanner(System.in);
		Socket socket = new Socket("localhost", 3000);
		Scanner scansocket = new Scanner(socket.getInputStream());
		System.out.println("Enter a number : ");
		int number = scan.nextInt();
		PrintStream ps = new PrintStream(socket.getOutputStream());
		ps.println(number);
		int getNumber = scansocket.nextInt();
		System.out.println(getNumber);
		
	}

}
