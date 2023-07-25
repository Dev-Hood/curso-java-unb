package exer_4;

public class PagamentoCartaoCredito implements FormaPagamento {
    private String numeroCartao;
    private String dataValidade;
    private String codigoSeguranca;

    public PagamentoCartaoCredito(String numeroCartao, String dataValidade, String codigoSeguranca) {
        this.numeroCartao = numeroCartao;
        this.dataValidade = dataValidade;
        this.codigoSeguranca = codigoSeguranca;
    }

    @Override
    public void efetuarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " com cartão de crédito: " + numeroCartao);
    }
}
