package com.engenheironet.debbuging;

import java.util.Scanner;

/*Calculadora de médias de alunos*/
public class CalculadoraDeMedias {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] alunos = {"Carlos", "Simone", "Pedro", "Joao"};
		
		double media = calculaMediaDaTurma(alunos, scan);
		
		System.out.printf("Média da Turma %.2f", media);
	}
	
	public static double calculaMediaDaTurma(String[] alunos, Scanner scanner) {
		
		double soma = 0;
		for(String aluno : alunos) {
			System.out.printf("Nota do aluno %s: ", aluno);
			double nota = scanner.nextDouble();
			soma += nota;
		}
		
		return (soma / alunos.length);
	}
}
