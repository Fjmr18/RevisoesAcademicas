package Classes;
import Interface.Pagamento;

// Implementação da Interface
public class PagamentoCartao implements Pagamento{
    @Override
    public void processar(double valor) {
        System.out.println("A processar " + valor + " EUR via Cartao...");
    }
}
