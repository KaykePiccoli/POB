package exercicios.exercicios07.questao01;

public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.setPreco(preco);
        this.setQuantidadeEstoque(quantidadeEstoque);
    }

    public Produto(String nome, double preco) {
        this(nome, preco, 0);
    }

    public double calcularValorTotalEmEstoque() {
        return preco * quantidadeEstoque;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro: o preço não pode ser negativo. Valor mantido em " + this.preco);
        }
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque >= 0) {
            this.quantidadeEstoque = quantidadeEstoque;
        } else {
            System.out.println("Erro: a quantidade em estoque não pode ser negativa. Valor mantido em " + this.quantidadeEstoque);
        }
    }
}
