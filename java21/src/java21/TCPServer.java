package java21;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws Exception {//업 캐스팅이다
		ServerSocket server = new ServerSocket(9100);//자기 아이피가 잡혀 있다
		System.out.println("TCP 서버 소켓 시작됨..");
		System.out.println("클라이언트의 연결 기다리는중..");
		while(true) {
			Socket socket = server.accept();
			System.out.println("클라이언트랑! 연결 성공!");
		}
		
		
	}

}
