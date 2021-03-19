package Sever;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) {

		Socket socket = null;

		try {
			socket = new Socket();
			System.out.println("[클라이언트] 연결 요청");
			socket.connect(new InetSocketAddress("localhost", 10001));
			System.out.println("[클라이언트] 연결 성공");

			OutputStream os = socket.getOutputStream();
			String data = "Hello Socket!!";
			os.write(data.getBytes("UTF-8"));
			os.close();
			
			

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (socket != null && socket.isClosed() == false) {
				try {
					socket.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		}

	}

}
