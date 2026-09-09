package exercicios.exercicios05;
import java.util.Scanner;

public class SomaLinhas{
    
    public static void main(String[] args) {
        double[][] matriz = new double[4][3];
        int[] vetor = new int[4];
        int i, j, soma=0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os valores para a matriz 4x3: ");
        for(i=0; i<4; i++) {
            for (j=0; j<3; j++) {
                System.out.printf("Digite o valor para a posição [%d][%d]: ", i+1, j+1);
                matriz[i][j] = sc.nextInt();
            }
        }
        sc.close();

        for(i=0; i<4; i++) {
            for(j=0; j<3; j++) {
                if(j<=2){
                    soma+=matriz[i][j];
                }
                if(j==2){
                    vetor[i]=soma;
                    soma=0;
                }
            }
        }
        
        for(i=0; i<4; i++){
            System.out.println(" "+ vetor[i]);
        }
    }
}