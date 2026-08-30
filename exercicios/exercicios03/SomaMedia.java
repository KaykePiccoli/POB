package exercicios.exercicios03;
import java.util.Scanner;

public class SomaMedia {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        int quant = 0, soma =0;
        while (true){
            System.out.println("Informe um numero: ");
            int numero = scanner.nextInt();

            if (numero < 0){
                break;
            }
            quant++;
            soma += numero;
        }   
        scanner.close();
        
        System.out.println(+ quant + " Numeros foram inseridos");
        System.out.println("A soma de todos os numero e: " + soma);
        System.out.println("A media de todos os numeros e: " + (soma/quant));
    }
}