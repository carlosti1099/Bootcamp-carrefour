package com.engenheironet.desafio;

/*
 * Desafio java - Multiplicar dois valores inteiros
 * e atribuir � vari�vel PROD.
 * 
 * */
import java.util.Scanner;

	public class MultiplicacaoSimples {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int A, B, PROD;
			
			System.out.println("Digite um valor para A: ");
			A = sc.nextInt();
			
			System.out.println("Digite um valor para B: ");
			B = sc.nextInt();
			
			PROD =  (A * B); //implemente o c�digo que representa a multiplica��o.
			
			System.out.println("PROD = " + PROD);
			
			sc.close();
			
		}
	}
