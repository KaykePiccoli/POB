package exercicios.exercicios06.questao5;

public class ClasseAluno {

    String nome;
    String matricula;
    double nota1;
    double nota2;

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public String verificarAprovacao() {
        if (this.calcularMedia() > 7) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public void imprimirBoletim() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.printf("Média final: %.2f%n", this.calcularMedia());
        System.out.println("Situação: " + this.verificarAprovacao());
    }
}