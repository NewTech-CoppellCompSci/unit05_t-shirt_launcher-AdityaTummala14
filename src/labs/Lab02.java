package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {

		problem1();
		problem2();
		problem3();
		problem4();

	}


	public static void problem1() {
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int input = inKey.nextInt();
		System.out.print("Enter another positive integer: ");
		int input2 = inKey.nextInt();
		int max = Math.max(input, input2);
		int min = Math.min(input, input2);
		for (int i = 0; i<100; i++) {
			System.out.print((int) (Math.random()*(max - min + 1)) + min + " ");
		}
		System.out.print("\n");
	}


	public static void problem2() {
		Scanner inKey = new Scanner(System.in);
		System.out.print("What is the radius of your cylinder: ");
		double rad = inKey.nextDouble();
		System.out.print("What is the height of your cylinder: ");
		double ht = inKey.nextDouble();
		System.out.print(Math.PI*(rad*rad)*ht);
		System.out.print("\n");
	}


	public static void problem3() {
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter x1: ");
		double x1 = inKey.nextDouble();
		System.out.print("Enter y1: ");
		double y1 = inKey.nextDouble();
		System.out.print("Enter x2: ");
		double x2 = inKey.nextDouble();
		System.out.print("Enter y2: ");
		double y2 = inKey.nextDouble();
		double x = Math.pow((x2-x1),2);
		double y = Math.pow((y2-y1),2);
		double xy = x + y;
		System.out.print("Distance between points = " + Math.sqrt(xy));
	}

	
	
	public static void problem4() {
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter a-value: ");
		double a = inKey.nextDouble();
		System.out.print("Enter b-value: ");
		double b = inKey.nextDouble();
		System.out.print("Enter c-value: ");
		double c = inKey.nextDouble();
		double p1p = b*(-1) + (Math.sqrt(b*b - 4*a*c));
		double p2p = p1p/(2*a);
		double p1n = b*(-1) - (Math.sqrt(b*b - 4*a*c));
		double p2n = p1n/(2*a);
		System.out.println("x1 = " + p2p);
		System.out.println("x2 = " + p2n);
	}



}
