package aulaseis;

import java.util.Scanner;

public class ExercicioLacosSeis {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int decremento = numero + 1;

		
		for (int i = 0; decremento != 1; i++) {
			decremento = decremento - 1;
			int modus = numero % decremento;
			if (modus == 0) {
				System.out.println(numero / decremento);
			}
		}
		sc.close();
	}

}
