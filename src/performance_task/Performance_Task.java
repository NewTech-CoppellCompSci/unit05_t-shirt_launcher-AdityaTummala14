package performance_task;

import java.util.Scanner;

public class Performance_Task {

	public static void main(String[] args) {
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter launch velocity (m/s) >>>");
		int vel = inKey.nextInt();
		System.out.print("Enter launch angle (degrees) >>>");
		int deg = inKey.nextInt();
		System.out.println("Projectile's Path: ");
		
		double degsin = Math.sin(Math.toRadians(deg));
		double degcos = Math.cos(Math.toRadians(deg));
		double time = 0.0;
		double ypos = 5;
		double xpos = 5;
		boolean bool = true;
		
		while (bool && ypos >=0){
		ypos = (degsin*time*vel) - 0.5*9.8*(time*time);
		xpos = (degcos*time*vel);
		if(ypos <0){
			ypos = 0.0;
			bool = false;
		}
		System.out.println("Time: " + time + "s");
		System.out.println("- x-pos: " + xpos + "m");
		System.out.println("- y-pos: " + ypos + "m");
		time++;
		}
	}
	
}
