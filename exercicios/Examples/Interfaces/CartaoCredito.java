package Examples.Interfaces;

public class CartaoCredito implements FormaPagamento{
    private int numero;
    private String titular;
    private int saldo;
    private int limite;

    public CartaoCredito(int numero, String titular, int saldo, int limite) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;
    }


    @Override
    public void pagar(FormaPagamento formaPagamento) {
        CartaoCredito cartaoCredito = (CartaoCredito) formaPagamento;
        System.out.println(cartaoCredito.titular);
    }

    @Override
    public void pagar(Double valor) {
        limite -= valor;
        System.out.println("Seu limite agora é de "+ this.limite);
    }

}
