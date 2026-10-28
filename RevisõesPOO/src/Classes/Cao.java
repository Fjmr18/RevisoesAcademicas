package Classes;
import Abstratas.Animal;

public class Cao extends Animal{
    public Cao(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println(nome + " diz: Au au!");
    }
}
