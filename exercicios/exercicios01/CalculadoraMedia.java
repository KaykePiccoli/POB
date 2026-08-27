package exercicios.exercicios01;
import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe sua nota da AV1:");
        double nota1 = scanner.nextDouble();
        System.out.println("Informe sua nota da AV2:");
        double nota2 = scanner.nextDouble();
        System.out.println("Informe sua nota da AV3:");
        double nota3 = scanner.nextDouble();

        double media = (nota1+nota2+nota3)/3;
        System.out.println("Sua media final: " + media);
    }
}