package socketProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Server
{
	public static void main(String args[])
	{
		try 
		{
			ServerSocket ss = new ServerSocket(3000);
			Socket  socket = ss.accept();
			Scanner scan = new Scanner(socket.getInputStream());
			try
			{
				int num = scan.nextInt();
				int returnNum = 2*num;
				PrintStream ps = new PrintStream(socket.getOutputStream());
				ps.println(returnNum);
			} 
			
			catch(NoSuchElementException e)
			{
				System.out.println("Enter Correct Number");
				return ;
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
			
		}
		
	}

}
