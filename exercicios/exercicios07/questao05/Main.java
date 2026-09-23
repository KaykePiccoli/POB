package exercicios.exercicios07.questao05;

public class Main {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Beatriz Lima", "F-2026-01", 3200.0);

        funcionario.exibirDados();

        // Tentativa válida: aumento
        System.out.println("Tentando aumentar salário para 3500.0...");
        funcionario.setSalario(3500.0);
        funcionario.exibirDados();

        // Tentativa inválida: redução
        System.out.println("Tentando reduzir salário para 3000.0...");
        funcionario.setSalario(3000.0);
        funcionario.exibirDados();

        // Tentativa inválida: valor igual ao atual
        System.out.println("Tentando definir salário igual ao atual (3500.0)...");
        funcionario.setSalario(3500.0);
        funcionario.exibirDados();
    }
}
