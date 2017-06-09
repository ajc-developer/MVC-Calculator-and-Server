package calc_server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.locks.ReentrantLock;

public class RequestHandler extends Thread {
	static ReentrantLock counterLock = new ReentrantLock(true);

	static void addToList(String eqn) {
		counterLock.lock();
		try {
			Driver.eqns.add(eqn);
		} finally {
			counterLock.unlock();
		}
	}

	private Socket cs = null;

	public RequestHandler(Socket cs) {
		this.cs = cs;
	}

	public void run() {
		try {
			OutputStream out = cs.getOutputStream();
			InputStream in = cs.getInputStream();
			String line = convertStreamToString(in);
			System.out.println("Server got line: " + line);
			addToList(line);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	static String convertStreamToString(java.io.InputStream is) {
	    @SuppressWarnings("resource")
		java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
	    return s.hasNext() ? s.next() : "";
	}
}
