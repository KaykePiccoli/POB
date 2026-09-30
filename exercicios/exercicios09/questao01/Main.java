package exercicios.exercicios09.questao01;

public class Main {

    // Aceita qualquer objeto que cumpra o contrato MetodoPagamento
    public static void finalizarCompra(MetodoPagamento metodo, double total) {
        System.out.println("Método: " + metodo.obterDetalhes());
        metodo.processarPagamento(total);
        System.out.println("Após a compra -> " + metodo.obterDetalhes());
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {

        MetodoPagamento cartao = new CartaoCredito("1234567812345678", 1000.0);
        MetodoPagamento pix = new Pix("maria@email.com");

        finalizarCompra(cartao, 350.0);   // aprovado
        finalizarCompra(cartao, 900.0);   // recusado (limite restante: 650)
        finalizarCompra(pix, 200.0);      // aprovado
    }
}