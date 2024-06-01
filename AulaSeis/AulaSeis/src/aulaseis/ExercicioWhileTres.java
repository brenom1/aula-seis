package aulaseis;

import java.util.Scanner;

public class ExercicioWhileTres {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("MUITO OBRIGADO");
		
		int gasolina = 1;
		int alcool = 1;
		int diesel = 1;
		int fim = 4;
	
		int somaGasolina = 0;
		int somaAlcool = 0;
		int somaDiesel = 0;
		int codigo = sc.nextInt();
		
		while (codigo != 4) {
			if (codigo == 1) {
				somaGasolina = somaGasolina + gasolina;
			}
			else if (codigo == 2) {
				somaAlcool = somaAlcool + alcool;
			}
			else if (codigo == 3) {
				somaDiesel = somaDiesel + diesel;
			}
			System.out.println("Gasolina: " + somaGasolina);
			System.out.println("Alcool: " + somaAlcool);
			System.out.println("Diesel: " + somaDiesel);
			
			codigo = sc.nextInt();
		}
		
		sc.close();
	}
}
