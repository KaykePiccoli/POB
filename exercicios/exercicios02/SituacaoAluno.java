package exercicios.exercicios02;
package exercicios.exercicios02;
import java.util.Scanner;

public class SituacaoAluno {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Informe nota AV1: ");
       int av1 = scanner.nextInt();

       System.out.println("Informe nota AV2: ");
       int av2 = scanner.nextInt();

       int media = (av1+av2)/2;    
       if(media>=7){
           System.out.println("Aluno aprovado!");
       }else{
           if( (media>=5) && (media<7) ){
               System.out.println("Aluno esta de recuperacao");
           }else{
               System.out.println("Aluno reprovado.");
           }
       }
       scanner.close();
   }
}