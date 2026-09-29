package exercicios.exercicios08.questao02;

public class Vendedor extends Funcionario {
    private Double totalVendas;
    private Double comissaoPercentual;

    public Vendedor(String nome, Double salarioBase, double totalVendas, double comissaoPercentual) {
        super(nome, salarioBase);
        this.totalVendas = totalVendas;
        this.comissaoPercentual = comissaoPercentual;
    }

    @Override
    public double calcularSalario() {
    return salarioBase + (totalVendas * comissaoPercentual / 100);
}
}