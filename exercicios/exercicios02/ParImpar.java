package exercicios.exercicios02;
package exercicios.exercicios02;
import java.util.Scanner;

public class ParImpar {
 public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Insira um numero decimal: ");
       int numero = scanner.nextInt();

       if(numero%2==0){
           System.out.println("O numero inserido e par!");
       }else{
           System.out.println("O número inserido e impar!");
       }

       scanner.close();
   }
}