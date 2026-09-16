package exercicios.exercicios06;

public class ClasseFuncionario{
    String nome;
    String cargo;
    double salarioBruto;

    public void aplicarAumento(double porcentagem) {
        double acrescimo = salarioBruto * (porcentagem / 100);
        salarioBruto += acrescimo;
    }

    public double calcularSalarioLiquido(double descontoImposto) {
        return salarioBruto - descontoImposto;
    }
}

class Main {
    public static void main(String[] args) {
        ClasseFuncionario funcionario = new ClasseFuncionario();
        funcionario.nome = "Carlos Souza";
        funcionario.cargo = "Analista de Sistemas";
        funcionario.salarioBruto = 4000.0;

        System.out.println("Antes do aumento:");
        System.out.println("Salário bruto: " + funcionario.salarioBruto);

        funcionario.aplicarAumento(10.0); // aumento de 10%

        System.out.println("\nApós o aumento de 10%:");
        System.out.println("Salário bruto: " + funcionario.salarioBruto);

        double salarioLiquido = funcionario.calcularSalarioLiquido(500.0);
        System.out.println("Salário líquido (com desconto de 500): " + salarioLiquido);
    }
}