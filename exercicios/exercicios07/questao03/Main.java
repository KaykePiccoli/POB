package exercicios.exercicios07.questao03;

public class Main {

    public static void main(String[] args) {

        // Retângulo válido
        Retangulo r1 = new Retangulo(5.0, 3.0);
        System.out.println("R1 -> Área: " + r1.calcularArea() + " | Perímetro: " + r1.calcularPerimetro());

        // Retângulo com valores inválidos (deve usar o padrão 1.0 e avisar)
        System.out.println("\nCriando R2 com largura e altura inválidas...");
        Retangulo r2 = new Retangulo(-4.0, 0.0);
        System.out.println("R2 -> Área: " + r2.calcularArea() + " | Perímetro: " + r2.calcularPerimetro());

        // Alterando altura para um valor inválido depois de criado
        System.out.println("\nTentando definir altura inválida em R1...");
        r1.setAltura(-2.0);
        System.out.println("R1 -> Área: " + r1.calcularArea() + " | Perímetro: " + r1.calcularPerimetro());
    }
}