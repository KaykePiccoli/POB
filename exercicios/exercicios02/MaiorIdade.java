package exercicios.exercicios02;
import java.util.Scanner;


public class MaiorIdade{
   public static void main(String[] args){
       int ano=2026;

       Scanner scanner = new Scanner(System.in);
           System.out.println("Qual ano de seu nascimento?");
           int nascimento = scanner.nextInt();
       scanner.close();

       if ((ano-nascimento)>=18){
           System.out.println("Maior de idade.");
       }else{
           System.out.println("Menor de idade.");
       }
   }
}