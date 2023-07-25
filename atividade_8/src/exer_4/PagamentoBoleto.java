package exer_4;

public class PagamentoBoleto implements FormaPagamento {
    private String numeroBoleto;

    public PagamentoBoleto(String numeroBoleto) {
        this.numeroBoleto = numeroBoleto;
    }

    @Override
    public void efetuarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " com boleto: " + numeroBoleto);
    }
}
