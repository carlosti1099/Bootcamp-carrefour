package com.engenheironet.debbuging;

/*Pilha de Execu��o de um Programa Java*/

public class Main {
	public static void main(String[] args) {
		System.out.println("iniciando pelo m�todo main");
		a();
		System.out.println("Finalizou do programa no m�todo main.");
	}
	
	//Metodos default
	static void a() {
		System.out.println("Entrou no m�todo a.");
		b();
		System.out.println("Finalizou o m�todo a.");
	}
	
	//Metodos default
	static void b() {
		System.out.println("Entrou no m�todo b.");
		for(int i = 0; i <= 5; i++) System.out.println(i);
		c();
		System.out.println("Finalizou o m�todo b.");
	}
	
	//Metodo
	static void c() {
		System.out.println("Entrou no m�todo c.");
		Thread.dumpStack();
		System.out.println("Finalizou o m�todo c.");
	}

	
}
