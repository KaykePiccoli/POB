package Exercicios19_08;
import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("De a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit;
        fahrenheit = (celsius*1.8)+32;
        System.out.println("A temperatura em Fahrenheit e:" + fahrenheit);

    }
}
