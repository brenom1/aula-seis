package aulaseis;

import java.util.Scanner;

public class ExercicioWhileDois {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int y = sc.nextInt();
		int x = sc.nextInt();
		while (y != 0 && x != 0) {
			if (y > 0 && x > 0) {
				System.out.println("Primeiro");
			}
			else if (y < 0 && x > 0) {
				System.out.println("Segundo");
			}
			y = sc.nextInt();
			x = sc.nextInt();
		}
	}
}
