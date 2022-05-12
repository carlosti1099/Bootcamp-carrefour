package com.engenheironet.desafio;

/*
 * Desafio java - Multiplicar dois valores inteiros
 * e atribuir à variável PROD.
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
			
			PROD =  (A * B); //implemente o código que representa a multiplicação.
			
			System.out.println("PROD = " + PROD);
			
			sc.close();
			
		}
	}
