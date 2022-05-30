package com.curso.java;

public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.setCor("Azul");
        carro.setModelo("Uno");
        carro.setTamanhoDoTanque(30);

        System.out.println(carro.getModelo() + " - " + carro.getCor() +  " - " +
                carro.getTamanhoDoTanque());

        System.out.println(carro.totalTanquecheio(6.895));
    }
}
