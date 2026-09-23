package exercicios.exercicios06.questao4;
public class funcionario {

    private String nome;
    private String cargo;
    private double salarioBruto;

    public funcionario(String nome, String cargo, double salarioBruto) {
        this.nome = nome;
        this.cargo = cargo;
        this.salarioBruto = salarioBruto;
    }

    public void aplicarAumento(double porcentagem) {
        double acrescimo = salarioBruto * (porcentagem / 100);
        salarioBruto += acrescimo;
    }

    public double calcularSalarioLiquido(double descontoImposto) {
        return salarioBruto - descontoImposto;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }
}