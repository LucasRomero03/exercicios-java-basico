package Examples.Interfaces;

public class CCredito extends Cartao {
    private int limite;

    public CCredito(int numero, String titular,  int limite) {
        super(numero, titular);
        this.limite = limite;
    }

    @Override
    public void pagar(FormaPagamento formaPagamento) {
        CartaoCredito cartaoCredito = (CartaoCredito) formaPagamento;
        //System.out.println(cartaoCredito.titular);
    }

    @Override
    public void pagar(Double valor) {
        limite -= valor;
        System.out.println("Seu limite agora é de "+ this.limite);
    }
}
