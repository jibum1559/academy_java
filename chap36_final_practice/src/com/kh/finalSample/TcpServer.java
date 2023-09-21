package com.kh.finalSample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
		public static void main(String[] args) { //try,catch 또는 throws Exception { 사용
		try {
			int port = 3333;
			ServerSocket server;
			server = new ServerSocket(port);
			System.out.println("서버가 포트" + port + "에서 실행 중이야");
			
			while(true) {
				Socket client = server.accept();
				System.out.println("클라이언트가 접속했어");
			
				BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
				PrintWriter out = new PrintWriter(client.getOutputStream(), true);
				
				String clientMsg;
					
				
				client.close();
				server.close();
			}		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}