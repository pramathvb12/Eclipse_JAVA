package prog3;

import java.util.Random;
import java.util.Scanner;


public class Main {
	static Thread generator;
	static Thread square;
	 static Thread cube;
	

	public static void main(String[] args)  {
		
		
		 generator = new Generator();
		 square = new Square();
		 cube = new Cube();
		 square.start();
		 cube.start();
		 generator.start();
	}

	}

class Generator extends Thread {
	 static int number;
	 @Override
	 public void run() {
	 Random random = new Random();
	 for (int i = 0; i < 10; i++) {
	 number = random.nextInt(10) + 1;
	 System.out.println("\nRandom Number: " + number);
	 prog3.Square.interrupted();
	 prog3.Cube.interrupted();
	 try {
	 Thread.sleep(1000);
	 } catch (InterruptedException e) {
	 e.printStackTrace();
	 }
	 }
	 }
	}
	class Square extends Thread {
	 @Override
	 public void run() {
	 for (int i = 0; i < 10; i++) {
	 try {
	 Thread.sleep(99999);
	 } catch (InterruptedException e) {
	 System.out.println("Square: " + (Generator.number * 
	Generator.number));
	 }
	 }
	 }
	}
	class Cube extends Thread {
	 public static final String Main = null;

	@Override
	 public void run() {
	 for (int i = 0; i < 10; i++) {
	 try {
	 Thread.sleep(99999);
	 } catch (InterruptedException e) {
	 System.out.println("Cube: " + (Generator.number * 
	Generator.number * Generator.number));
	 }
	 }
	 }
	}
