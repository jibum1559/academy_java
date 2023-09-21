package com.kh.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExam {

	public static void main(String[] args) {
		PersonSerial p = new PersonSerial("KH", 30);
		//객체를 직렬화하여 파일에 저장
		try {
			FileOutputStream fileOut = new FileOutputStream("person.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(p);
			out.close();
			fileOut.close();
			System.out.println("Person 객체가 직렬화되어 Person.txt 파일에 저장됨");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//파일에서 객체를 역직렬화하여 읽어옴
		try { //try 두 번 쓰고싶지 않으면 throw 하면 됨. 해보자!
			FileInputStream fileIn = new FileInputStream("person.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			PersonSerial deSerialPerson = (PersonSerial) in.readObject();
			in.close();
			fileIn.close();
			System.out.println("person.txt 파일에서 객체를 역직렬화하였습니다.");
			System.out.println("역직렬화된 객체 정보 : " + deSerialPerson);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
