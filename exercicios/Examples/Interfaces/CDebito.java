package Examples.Interfaces;

public class CDebito extends Cartao {
    private int saldo;

    public CDebito(int numero, String titular, int saldo) {
        super(numero, titular);
        this.saldo = saldo;
    }


    @Override
    public void pagar(FormaPagamento formaPagamento) {

    }

    @Override
    public void pagar(Double valor) {
        this.saldo  -= valor;
        System.out.println("Pagamento realizado com sucesso e seu saldo agora é de: R$" + saldo);
    }
}
