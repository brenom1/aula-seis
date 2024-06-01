package aulaseis;

import java.util.Scanner;

public class ExercicioLacosUm {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		System.out.println("Numero inicial: " + numero);
		
		for (int i = 0; numero>i; i++) {
			int divisao = i % 2;
			if (divisao != 0) {
				System.out.println(i);
			}
			
		}
		sc.close();
	}
}

