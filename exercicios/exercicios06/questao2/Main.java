package exercicios.exercicios06.questao2;
import java.util.Scanner;

public class main {

    public static void Main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        double raio = scanner.nextDouble();

        circulo circulo = new circulo(raio);

        double area = circulo.calcularArea();
        double perimetro = circulo.calcularPerimetro();

        System.out.printf("Área do círculo: %.2f%n", area);
        System.out.printf("Perímetro do círculo: %.2f%n", perimetro);

        scanner.close();
    }
}