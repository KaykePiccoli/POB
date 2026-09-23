package exercicios.exercicios07.questao05;

public class Funcionario {

    private String nome;
    private String matricula;
    private double salario;

    public Funcionario(String nome, String matricula, double salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getSalario() {
        return salario;
    }

    // Só permite alteração se o novo salário for estritamente maior que o atual
    public void setSalario(double novoSalario) {
        if (novoSalario > this.salario) {
            this.salario = novoSalario;
        } else {
            System.out.println("Erro: o novo salário (" + novoSalario
                    + ") deve ser maior que o salário atual (" + this.salario + "). Alteração não realizada.");
        }
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.printf("Salário: R$%.2f%n", salario);
        System.out.println("----------------------------");
    }
}