package Examples.Interfaces;

public class Pix implements FormaPagamento{
    private int numero;
    private String titular;

    public Pix(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }


    @Override
    public void pagar(FormaPagamento formaPagamento) {

    }

    @Override
    public void pagar(Double valor) {
        System.out.printf("Pagando %s com sucesso \n",valor);
    }
}
