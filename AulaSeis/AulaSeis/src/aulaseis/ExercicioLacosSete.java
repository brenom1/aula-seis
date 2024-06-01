package aulaseis;

import java.util.Scanner;

public class ExercicioLacosSete {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int incremento = 0;
		
		for (int i = 0; numero>i; i++) {
			incremento = incremento + 1;
			int quadrado = incremento * incremento;
			int cubo = incremento * incremento * incremento;
			System.out.print(incremento);
			System.out.println(" "+quadrado+"  "+cubo);
			
		}

	}

}
