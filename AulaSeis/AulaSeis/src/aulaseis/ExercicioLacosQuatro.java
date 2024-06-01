package aulaseis;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioLacosQuatro {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int primeiroNumero = sc.nextInt();
		
		for (int i = 0; primeiroNumero>i; i++) {
			double segundoNumero = sc.nextInt();
			double terceiroNumero = sc.nextInt();
			double divisao = segundoNumero / terceiroNumero;
			System.out.printf("O resultado da divisão é: %.1f", divisao);
			if (terceiroNumero == 0) {
				System.out.println("Divisão impossível");
			}
		}
		sc.close();
	}

}
