package exer_4;

public class Transacao {
    private FormaPagamento formaPagamento;

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void realizarPagamento(double valor) {
        if (formaPagamento != null) {
            formaPagamento.efetuarPagamento(valor);
        } else {
            System.out.println("Forma de pagamento não selecionada.");
        }
    }
}
