package com.engenheironet.debbuging;

/*Pilha de Execução de um Programa Java*/

public class Main {
	public static void main(String[] args) {
		System.out.println("iniciando pelo método main");
		a();
		System.out.println("Finalizou do programa no método main.");
	}
	
	//Metodos default
	static void a() {
		System.out.println("Entrou no método a.");
		b();
		System.out.println("Finalizou o método a.");
	}
	
	//Metodos default
	static void b() {
		System.out.println("Entrou no método b.");
		for(int i = 0; i <= 5; i++) System.out.println(i);
		c();
		System.out.println("Finalizou o método b.");
	}
	
	//Metodo
	static void c() {
		System.out.println("Entrou no método c.");
		Thread.dumpStack();
		System.out.println("Finalizou o método c.");
	}

	
}
