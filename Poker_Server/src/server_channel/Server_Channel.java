package server_channel;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_Channel {
	
	ServerSocket ch_server;
	Socket newSocket;
	
	public Server_Channel()
	{
		try 
		{
			ch_server = new ServerSocket(8000);
			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			
		}
	}
	
	public void MakeRoom()
	{
		
	}
}
