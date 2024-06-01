package aulaseis;

import java.util.Scanner;

public class ExercicioLacosCinco {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int fatorial = sc.nextInt();
		int adicionador = 1;
		int outroCalculo = 1;
		
		if (fatorial == 0) {
			System.out.println("1");
		}
		for (int i = 0; fatorial>i; i++) {
			int calculoPrimario = i + adicionador;
			outroCalculo = outroCalculo * calculoPrimario;
			System.out.println(outroCalculo);
		}
		sc.close();
	}
}