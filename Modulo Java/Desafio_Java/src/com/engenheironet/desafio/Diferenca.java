package com.engenheironet.desafio;

import java.io.IOException;
import java.util.Scanner;

/*
 * Leia quatro valores inteiros A, B, C e D. A seguir, calcule
 * e mostre a diferença do produto de A e B pelo produto
 * de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 * */

public class Diferenca {

 public static void main(String[] args) throws IOException {

  Scanner leitor = new Scanner(System.in);
  
  System.out.println("Digite um valor para A: ");
  int A = leitor.nextInt();

  System.out.println("Digite um valor para b: ");
  int B = leitor.nextInt();

  System.out.println("Digite um valor para c: ");
  int C = leitor.nextInt();

  System.out.println("Digite um valor para d: ");
  int D = leitor.nextInt();

  System.out.println("DIFERENCA = " + (A * B - C * D));

 }

}
