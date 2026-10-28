package Abstratas;

// 3. Herança & 4. Polimorfismo: Is-a & Many forms
public abstract class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    // Método abstrato (obriga as filhas a implementar)
    public abstract void fazerSom();
}
