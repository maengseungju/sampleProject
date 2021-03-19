package Sever;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) {

		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 10001));
			System.out.println("[서버] 연결 기다림");
			Socket socket = serverSocket.accept();
			InetSocketAddress inetSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
			System.out
					.println("[서버] 연결됨 from " + inetSocketAddress.getHostName() + " : " + inetSocketAddress.getPort());

			// 클라이언트 소켓으로 데이터를 보내기 위한 준비
			OutputStream os = socket.getOutputStream();

			String data = "안녕! 클레오파트라!!!!!\n";
			// 인터넷으로 테이터를 보내기 위해 변환(UTF -> Byte[])
			os.write(data.getBytes("UTF-8"));
			// os가 사용하는 버퍼를 출력(네트워크)쪽으로 보내기(비움)
			os.flush();
			// os.close();

			InputStream is = socket.getInputStream();
			while (true) {
				byte[] buffer = new byte[128]; // 버퍼크기 128 바이트로 지정
				// is에서 읽을때 buffer의 크기만큼 읽어서 buffer에 넣고 결과(읽은 바이트 수)를 readByteCount로 리턴한다
				int readByteCount = is.read(buffer);

				if (readByteCount < 0) { // 읽은 바이트 크기가 0미만이면 클라이언트 연결끊김
					System.out.println("[서버] 클라이언트로 부터 연결 끊김");
					is.close();
					socket.close();
					break;
				}
				String data1 = new String(buffer, 0, readByteCount, "UTF-8");
				
				System.out.println(data1);
			}

			socket.close();


		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (serverSocket != null && serverSocket.isClosed() == false) {
				try {
					serverSocket.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		}
	}
}
