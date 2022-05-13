package com.engenheironet.poo;
/**
 * Classe de exemplo para o exercício da Aula 2 de Orientação a Objetos.
 */
public class Principal {

    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.setCor("Branca");
        carro1.setModelo("Gol G3 Power");
        carro1.setCapacidadeTanque(55);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.99));

        Carro carro2 = new Carro("Cinza", "Mercedes-Benz Classe C ", 66);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(7.02));

    }
}