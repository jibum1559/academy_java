package com.kh.classSample;

public class CarMain {

	public static void main(String[] args) {
		//Scanner     sc = new Scanner(System.in);
		//public Car(String brand, String model, );
	   System.out.println("");
		
		Car myCar = new Car("Toyota","Carmy");
		
		Car myCar2 = new Car("Toyota","NNNN");
	   myCar.startEngine();
	   myCar.acclerate(50);
	   
	  
	}

}