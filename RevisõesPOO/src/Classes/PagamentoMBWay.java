package Classes;
import Interface.Pagamento;

public class PagamentoMBWay implements Pagamento {
    @Override
    public void processar(double valor) {
        System.out.println("A processar " + valor + " EUR via MB Way...");
    }
}