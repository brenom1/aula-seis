package aulaseis;

import java.util.Scanner;

public class ExercicioWhileUm {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int pergunta = sc.nextInt();
		
		while (pergunta != 2002) {
			System.out.println("Senha invalida");
			pergunta = sc.nextInt();
			
		}
		System.out.println("Acesso Permitido");
		sc.close();
	}
}
