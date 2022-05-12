package com.engenheironet.array;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class OrdemInversa {
	public static void main(String[] args) {
		
		int[] vetor = {0, 3, -6, -9, 8, 30};
		
		System.out.print("Vetor original: ");
		int count = 0;
		while(count <= (vetor.length-1)) {
			System.out.print(vetor[count] + " ");
			count++;
		}
		System.out.print("\nVetor inverso: ");
		for(int i = (vetor.length - 1); i >= 0; i --) {
			System.out.print(vetor[i] + " ");
		}
	}

}
