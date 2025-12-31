package Examples.Interfaces;

public interface FormaPagamento {
    void pagar(FormaPagamento formaPagamento);

    void pagar(Double valor);
}
