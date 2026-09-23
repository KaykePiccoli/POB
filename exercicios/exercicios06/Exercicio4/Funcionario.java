public class Main {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("João Pereira", "Analista de Sistemas", 3000.0);

        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.printf("Salário bruto antes do aumento: R$%.2f%n", funcionario.getSalarioBruto());

        funcionario.aplicarAumento(10); // aumento de 10%

        System.out.printf("Salário bruto após o aumento: R$%.2f%n", funcionario.getSalarioBruto());

        double salarioLiquido = funcionario.calcularSalarioLiquido(400.0);
        System.out.printf("Salário líquido (após desconto de imposto): R$%.2f%n", salarioLiquido);
    }
}