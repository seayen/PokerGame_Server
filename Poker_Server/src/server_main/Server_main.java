package server_main;

import java.util.HashMap;

public class Server_main {
	
	HashMap<Integer,Session> Sessions;
	
	public Server_main()
	{
		Sessions = new HashMap<Integer,Session>();
		
	}
	
	public void StartServer()
	{
		
	}
	
	private void StartNetSv()
	{
		Server_Net netSv = new Server_Net(8888,Sessions); 
	}
	
	private void StartLoginSv()
	{
		
	}
	
	private void StartChannelSv()
	{
		
	}
	
	private void StartWaitRoomSv()
	{
		
	}
	
	private void StartGameRoomSv()
	{
		
	}
	
	public static void main(String args[])
	{
		
	}
}
