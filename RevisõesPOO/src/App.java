import Abstratas.Animal;
import Classes.*;
import Interface.Pagamento;


public class App {
    public static void main(String[] args) {
        System.out.println("--- 1. COMPOSIÇÃO ---");
        Rodas rodasCarro = new Rodas(4, 'M');
        Rodas rodasDoOutroCarro = new Rodas(6, 'L');

        Carro meuCarro = new Carro("Toyota", 2020, rodasCarro); // Usando o construtor com composição
        Carro meuCamiao = new Carro("Carro Muito Grande", 2025, rodasDoOutroCarro);
        meuCarro.ligar();
        meuCamiao.ligar();

        System.out.println("\n--- 2. ENCAPSULAMENTO ---");
        ContaBancaria conta = new ContaBancaria(100.0);
        conta.depositar(100.0);
        System.out.println("Saldo: " + conta.getSaldo() + " EUR");

        System.out.println("\n--- 3 & 4. HERANÇA E POLIMORFISMO ---");
        Animal[] zoo = { new Cao("Bubi"), new Gato("Mimi") };
        for (Animal a : zoo) {
            a.fazerSom(); // Polimorfismo em ação!
        }

        System.out.println("\n--- 5. INTERFACES ---");
        Pagamento pag1 = new PagamentoCartao();
        Pagamento pag2 = new PagamentoMBWay();
        pag1.processar(49.99);
        pag2.processar(15.00);
    }
}