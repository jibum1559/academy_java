package com.kh.finalSample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
		public static void main(String[] args) { //try,catch �Ǵ� throws Exception { ���
		try {
			int port = 3333;
			ServerSocket server;
			server = new ServerSocket(port);
			System.out.println("������ ��Ʈ" + port + "���� ���� ���̾�");
			
			while(true) {
				Socket client = server.accept();
				System.out.println("Ŭ���̾�Ʈ�� �����߾�");
			
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