package Examples.Interfaces;

public class CartaoDebito implements FormaPagamento{
    private int numero;
    private String titular;
    private int saldo;

    public CartaoDebito(int numero, String titular, int saldo) {
        this.numero = numero;
        this.titular = titular;
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
