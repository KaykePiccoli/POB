package exercicios.exercicios09.questao01;

public class Pix implements MetodoPagamento {

    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento(double valor) {
        if (valor > 0) {
            System.out.println("Pagamento de R$" + valor + " realizado via Pix para a chave " + chavePix + ".");
        } else {
            System.out.println("Pagamento recusado: valor inválido.");
        }
    }

    @Override
    public String obterDetalhes() {
        return "Pix | Chave: " + chavePix;
    }
}