package wintertime;

import java.util.Scanner;

public class Speed {


public static void main(String[] args) {

		System.out.println("Enter the train Speed in Miles/Houer here: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if (x < 0) {
			System.out.println("please enter a positive number");
			x = sc.nextInt();
		}
		System.out.println(" Please enter the time traveled at " + x + " Miles/Houer: ");
		int t = sc.nextInt();
		if (t < 0) {
			System.out.println("please enter a positive number");
			t = sc.nextInt();
		}
		for (int k = 1; k <= t; k++) {
			System.out.println("Time-Distance traveled in Miles: " + k + " Houers ---" + k * x + "Miles;");
		}

	}
  }
  
  
  
  
  // or with Method; 
  
  public class Speed {
	public int calculateDistance() {
		System.out.println("Enter the train Speed in Miles/Houer here: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if (x < 0) {
			System.out.println("please enter a positive number");
			x = sc.nextInt();
		}
		System.out.println(" Please enter the time traveled at " + x + " Miles/Houer: ");
		int t = sc.nextInt();
		if (t < 0) {
			System.out.println("please enter a positive number");
			t = sc.nextInt();
		}
		for (int k = 1; k <= t; k++) {
			System.out.println("Time-Distance traveled in Miles: " + k + " Houers ---" + k * x + "Miles;");
		}
		return 1;
	}
  
  
  
  
  // or anoter shorter method
  
  public static int calculateDistance(int speed, int time) {
		if (speed < 0 || time < 0) {
			System.out.println("Please enter a positive number");
			return 1;
		}
		for (int i = 1; i < time; i++) {
			int x = speed * i;
			System.out.println("Time - Distance: " + i + " Houers " + x + " Miles;");
		}
		return 1;
	}


  
