package exercicios.exercicios01;
import java.util.Scanner;

public class CalculadoraInss {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Valor das Horas: ");
        int valor = scanner.nextInt();
        System.out.println("Horas de Trabalho:");
        int horas = scanner.nextInt();

        int valorBruto = valor * horas;
        double inss = (valorBruto * 10)/ 100;
        int valorLiquido = valorBruto - (int)inss;
        System.out.println("Seu salario e: " + valorLiquido);
    }
}