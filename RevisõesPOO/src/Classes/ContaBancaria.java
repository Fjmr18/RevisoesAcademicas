package Classes;

// 2. Encapsulamento
public class ContaBancaria {
    private double saldo; // Atributo trancado (privado)

    public ContaBancaria(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }
}
