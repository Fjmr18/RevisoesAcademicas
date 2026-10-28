package Classes;
import Abstratas.Animal;

public class Gato extends Animal{
        public Gato(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {    
        System.out.println(nome + " diz: Miau!");
    }
}
