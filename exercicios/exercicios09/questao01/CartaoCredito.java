package exercicios.exercicios09.questao01;

public class CartaoCredito implements MetodoPagamento {

    private String numeroCartao;
    private double limite;

    public CartaoCredito(String numeroCartao, double limite) {
        this.numeroCartao = numeroCartao;
        this.limite = limite;
    }

    @Override
    public void processarPagamento(double valor) {
        if (valor > 0 && valor <= limite) {
            limite -= valor;
            System.out.println("Pagamento de R$" + valor + " aprovado no cartão de crédito.");
        } else {
            System.out.println("Pagamento recusado: limite insuficiente ou valor inválido.");
        }
    }

    @Override
    public String obterDetalhes() {
        // Mostra apenas os 4 últimos dígitos por segurança
        String final4 = numeroCartao.length() >= 4
                ? numeroCartao.substring(numeroCartao.length() - 4)
                : numeroCartao;
        return "Cartão de Crédito final " + final4 + " | Limite disponível: R$" + limite;
    }
}