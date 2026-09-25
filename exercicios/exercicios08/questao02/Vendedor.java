package exercicios.exericios08.questao02;

public class Vendedor extends Funcionario{
    private Double totalVendas;
    private Double comissaoPercentual;

    public Vendedor(String nome, Double salarioBase, double totalVendas, double comissaoPercentual){
        super(nome, salarioBase);
        this.totalVendas= totalVendas;
        this.comissaoPercentual= comissaoPercentual;
    }

    @override
    public void calcularsalario(){
        
        salarioBase= totalVendas*comissaoPercentual;
        return salarioBase;
    }
}