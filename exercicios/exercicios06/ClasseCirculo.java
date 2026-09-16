package exercicios.exercicios06;

import java.util.Scanner;

public class ClasseCirculo{
    double raio;

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raioDigitado = scanner.nextDouble();

        ClasseCirculo circulo = new ClasseCirculo();
        circulo.raio = raioDigitado;

        double area = circulo.calcularArea();
        double perimetro = circulo.calcularPerimetro();

        System.out.printf("Área: %.2f%n", area);
        System.out.printf("Perímetro: %.2f%n", perimetro);

        scanner.close();
    }
}