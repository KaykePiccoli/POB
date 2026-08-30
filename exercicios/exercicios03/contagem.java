package exercicios.exercicios03;
import java.util.Scanner;
public class contagem {
    
    public static void main(String [] args){
        int inicio, fim, i;
        int par = 0, impar = 0;

    Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o inicio da contagem: ");
        inicio = scanner.nextInt();

        System.out.println("Informe o fim da contagem: ");
        fim = scanner.nextInt();
    scanner.close();

    for (i= inicio; i<= fim; i++){
        if(i%2==0){
            par++;
        }else{
            impar++;
        }
    }
    System.out.println("A quantidade de numero pares é: " + par);
    System.out.println("A quantidade de numero impares é: " + impar);
    }
}
