package exercicios.exercicios04;
import java.util.Scanner;
public class LeituraInversa{
    
    public static void main(String [] args){
        int i, tam = 5;
        int[] vetor = new int[tam];

        Scanner sc = new Scanner(System.in);
        for(i=0;i<5;i++){
            System.out.println("Forneça um valor: ");
            vetor[i] = sc.nextInt();
        }
        sc.close();

        for(i=4; i>=0;i--){
            System.out.println(" "+ vetor[i]);
        }
    }
}
