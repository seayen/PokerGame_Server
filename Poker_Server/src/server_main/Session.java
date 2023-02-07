package server_main;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Session extends Thread{

	Socket socket;
	InputStream in;
	OutputStream out;
	int id;
	
	public Session(Socket socket, int id)
	{
		this.socket = socket;
		in = null;
		out = null;
		this.id = id;
		
		setStream();
	}
	
	private void setStream()
	{
		try 
		{
			in = socket.getInputStream();
			out = socket.getOutputStream();
			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
			System.out.println("스트림 설정 오류");
		}
	}
	
	@Override
	public void run()
	{
		
	}
}
