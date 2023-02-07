package server_main;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class Server_Net extends Thread {

	ServerSocket Sv_Socket;
	Socket newSocket;
	HashMap<Integer,Session> Sessions;
	
	
	public Server_Net(int port, HashMap<Integer,Session> Sessions)
	{
		Sv_Socket = null;
		newSocket = null;
		this.Sessions = Sessions;
		
		setnet(port);
	}
	
	private void setnet(int port)
	{
		try 
		{
			Sv_Socket = new ServerSocket(port);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() 
	{
		int tempid = 1; //1~999
		try
		{
			while(true)
			{
				if(tempid==1000) tempid=1;
				newSocket = Sv_Socket.accept();
				System.out.println(Integer.toString(tempid)+" new");
				Sessions.put(tempid++, new Session(newSocket,tempid));
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("서버 종료");
		}
	}
	

}
