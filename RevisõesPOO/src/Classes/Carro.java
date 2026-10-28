package Classes;


// 1. COMPOSIÇÃO: Has-a
public class Carro {
    private String marca;
    private int ano;
    private Rodas rodas; // Composição aqui.

    public Carro(String marca, int ano, Rodas rodas) {
        this.marca = marca;
        this.ano = ano;
        this.rodas = rodas;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Adicionado para permitir trocar as rodas do carro
    public void setRodas(Rodas rodas) {
        this.rodas = rodas;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public Rodas getRodas() {
        return rodas;
    }

    public void ligar() {
        System.out.println("O " + marca + " (" + ano + ") com " + rodas + " ligou.");
    }
}