package exercicios.exercicios02;
import java.util.Scanner;

public class TipoTriangulo{
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
           System.out.println("Informe o lado A de um triangulo: ");
           int ladoA = scanner.nextInt();
           System.out.println("Informe o lado B de um triangulo: ");
           int ladoB = scanner.nextInt();
           System.out.println("Informe o lado C de um triangulo: ");
           int ladoC = scanner.nextInt();
       scanner.close();

       //verificacao se e um triangulo
       if((ladoA+ladoB>ladoC) && (ladoA+ladoC>ladoB) && (ladoB+ladoC>ladoA)){
          
           if((ladoA==ladoB) && (ladoA==ladoC) && (ladoB==ladoC)){
               System.out.println("Triangulo Equilatero");
           }else{
               if((ladoA!=ladoB) && (ladoA!=ladoC) && (ladoB!=ladoC)){
                   System.out.println("Triango Escaleno");
               }else{
                       System.out.println("Triango Isosceles");
                   }
               }
       }else{
           System.out.println("Os numeros informados nao formam um triangulo");
       }
   }
}