package com.engenheironet.desafio;

import java.io.IOException;
import java.util.Scanner;

/*
 * Faça um algoritmo para ler um número indeterminado de dados,
 * contendo cada um, a idade de um indivíduo. O último dado, que
 * não entrará nos cálculos, contém o valor de idade negativa.
 * Calcular e imprimir a idade média deste grupo de indivíduos.
 * */

public class MediaIdade {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        int cont = 0;
        double n = 1; // Nao existe idade 00
        double soma = 0;
        
        //complete o codigo
        while ( n >= 1 ) {
        	System.out.println("Digite um numero: ");
        	
            n = leitor.nextDouble();
            if ( n > 0 ) { 
                soma = soma + n; //complete o codigo
                cont++;
            }
        }
        double media = (soma / cont);
        System.out.println(String.format("%.2f", media));
    }
	
}