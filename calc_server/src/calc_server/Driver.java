package calc_server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Driver {
	static ArrayList<String> eqns;
	static ServerWindow window;
	static ServerWindowController wc;
	public static void main(String[] args) throws IOException {
		eqns = new ArrayList<String>();
		@SuppressWarnings("resource")
		final ServerSocket server = new ServerSocket(1150);		
		Thread sThread = new Thread(){
			public void run(){
				while(true){
					Socket client;
					try {
						client = server.accept();
						RequestHandler handler = new RequestHandler(client);
						handler.start();
					} catch (IOException e) {
						e.printStackTrace();
					}
					
				}
			}
		};
		sThread.start();
		
		window = new ServerWindow();
		wc = new ServerWindowController();
		wc.setInputWindow(window);
	}

}
