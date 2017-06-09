package calc_mvc;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;

public class ServerComThread implements Runnable {

	private String parameter;
	public ServerComThread(String parameter) {
		this.parameter = parameter;
	}

	public void run() {
		Socket socket;
		try {
			socket = new Socket("127.0.0.1", 1150);
			OutputStream out = socket.getOutputStream();
			InputStream in = socket.getInputStream();
			out.write(parameter.getBytes(Charset.defaultCharset()));
			in.close();
			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
