package Examples.Interfaces;

public abstract class Cartao implements FormaPagamento {
    private int numero;
    private String titular;

    public Cartao(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }
}
