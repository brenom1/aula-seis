package aulaseis;

import java.util.Scanner;

public class ExercicioLacosDois {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		if (numero > 10 && numero <20) {
			System.out.printf("Numero: %d in", + numero);
		}
		else {
			System.out.printf("Numero: %d out", + numero);
		}
		
		while (numero == numero) {
			numero = sc.nextInt();
			if (numero > 10 && numero <20) {
				System.out.printf("Numero: %d in", + numero);
			}
			else {
				System.out.printf("Numero: %d out", + numero);
			}
		}
		
		sc.close();
	}

}
