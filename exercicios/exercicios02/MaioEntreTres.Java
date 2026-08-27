package exercicios.exercicios02;
import java.util.Scanner;


public class Maior {
   public static void main(){
   Scanner scanner = new Scanner(System.in);

   System.out.println("Informe o primeiro numero: ");
   int numero1 = scanner.nextInt();

   System.out.println("Informe o segundo numero: ");
   int numero2 = scanner.nextInt();

   System.out.println("Informe o terceiro numero: ");
   int numero3 = scanner.nextInt();

   scanner.close();

       if( (numero1>numero2) && (numero1>numero3) ){
           System.out.println("O maior numero entre os tres e: " + numero1);
       }else{
           if ((numero2>numero1) && (numero2>numero3)){
               System.out.println("O maior numero entre os tres e: " + numero2);
           }else{
               System.out.println("O maior numero entre os tres e: " + numero3);
           }
       }
   }
}