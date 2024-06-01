package aulaseis;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioLacosTres {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero de casos de testes");
		
		double vezes = sc.nextDouble();
		double calculoPeso = 0;
		double terceiroCalculo = 0;
		double calculoFinal = 0;
		
		double peso = 0;
		for (int i = 0; vezes>i; i++) {
			double entradas = sc.nextDouble();
			
			if (i == 0) {
				peso = entradas * 2;
				calculoPeso = calculoPeso + peso;
				terceiroCalculo = terceiroCalculo + 2;
			}
			else if (i == 1) {
				peso = entradas * 3;
				calculoPeso = calculoPeso + peso;
				terceiroCalculo = terceiroCalculo + 3;
			}
			else if (i == 2) {
				peso = entradas * 5;
				calculoPeso = calculoPeso + peso;
				terceiroCalculo = terceiroCalculo + 5;
		}
			calculoFinal = calculoPeso / terceiroCalculo;
		}
		System.out.printf("O resultado é: %.2f", calculoFinal);
		sc.close();
		}
	}

