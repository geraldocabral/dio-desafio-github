package com.curso.java;

public class Carro extends Veiculo {
    String cor;
    String modelo;
    int tamanhoDoTanque;

    Carro(){
        this.cor = cor;
        this.modelo = modelo;
        this.tamanhoDoTanque = tamanhoDoTanque;
    }
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTamanhoDoTanque() {
        return tamanhoDoTanque;
    }

    public void setTamanhoDoTanque(int tamanhoDoTanque) {
        this.tamanhoDoTanque = tamanhoDoTanque;
    }

    double totalTanquecheio (double valorCombustivel){
        return (tamanhoDoTanque * valorCombustivel);
    }
}
