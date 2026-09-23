package exercicios.exercicios07.questao01;

public class Main {
    public static void main(String[] args) {

        Produto produtoA = new Produto("Notebook", 3500.0, 10);

        Produto produtoB = new Produto("Mouse", 80.0);

        System.out.println("Produto A: " + produtoA.getNome()
                + " | Preço: " + produtoA.getPreco()
                + " | Estoque: " + produtoA.getQuantidadeEstoque());
        System.out.println("Valor total em estoque (A): " + produtoA.calcularValorTotalEmEstoque());

        System.out.println("Produto B: " + produtoB.getNome()
                + " | Preço: " + produtoB.getPreco()
                + " | Estoque: " + produtoB.getQuantidadeEstoque());
        System.out.println("Valor total em estoque (B): " + produtoB.calcularValorTotalEmEstoque());

        System.out.println("\nTentando definir preço negativo para o Produto A...");
        produtoA.setPreco(-10.0);
        System.out.println("Preço do Produto A após tentativa inválida: " + produtoA.getPreco());
    }
}
