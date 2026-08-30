package exercicios.exercicios03;
import java.util.Scanner;

public class fatorial {
    
    public static void main(String [] args){
        int numero, i, fatorial = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um numero: ");
            numero = scanner.nextInt();
        scanner.close(); 

        for (i= 1; i<=numero; i++){
            fatorial = fatorial *i;
        }
        
        System.out.println("O fatorial é: " + fatorial);
    }
}