package server_room;

import java.net.Socket;
import java.util.ArrayList;

public class GameRoom implements Runnable {
	int Max_Client;
	int Now_Client;
	boolean Gaming;
	
	ArrayList<Socket> clients;
	
	Socket LineToChannel;
	
	
	
	GameRoom(int NofUser)
	{
		Max_Client = NofUser;
		Now_Client = 0;
		Gaming = false;
		
		clients = new ArrayList<Socket>();
		
		
	}


	@Override
	public void run()
	{
		while(true)
		{
			if(Gaming=false)
			{
				if(Now_Client<Max_Client)
				{
					clients.add(NewUserIn());
					Now_Client = Now_Client + 1;
				}
				else
				{
					System.out.println("Full");
				}
				
				Gaming = CheckStartGame();
			}
			else
			{
				StartGame();
			}
		}
	}

	private Socket NewUserIn() 
	{
		
		return null;
	}
	
	private boolean CheckStartGame() 
	{
		return false;
	}

	private void StartGame() 
	{
		
	}


	
}
