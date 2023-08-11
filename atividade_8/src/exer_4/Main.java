package exer_4;

public class Main {
    public static void main(String[] args) {
        Transacao transacao = new Transacao();

        // Pagamento com cartão de crédito
        FormaPagamento cartaoCredito = new PagamentoCartaoCredito("1234-5678-9012-3456", "12/25", "123");
        transacao.setFormaPagamento(cartaoCredito);
        transacao.realizarPagamento(100.0);

        // Pagamento com boleto
        FormaPagamento boleto = new PagamentoBoleto("78901234567890123456789012345678901234567890");
        transacao.setFormaPagamento(boleto);
        transacao.realizarPagamento(150.0);
    }
}
