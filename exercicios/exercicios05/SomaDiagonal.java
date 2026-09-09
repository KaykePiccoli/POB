package exercicios.exercicios05;
import java.util.Scanner;

public class SomaDiagonal{
    
    public static void main(String[] args) {
        double[][] matriz = new double[4][4];
        int i, j;
        double soma=0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os valores para a matriz 4x4: ");
        for(i=0; i<4; i++) {
            for (j=0; j<4; j++) {
                System.out.printf("Digite o valor para a posição [%d][%d]: ", i+1, j+1);
                matriz[i][j] = sc.nextInt();
            }
        }
        sc.close();

        for(i=0; i<4; i++) {
            for (j=0; j<4; j++) {
                if(i==j){
                    soma+=matriz[i][j];
                }
            }
        }
        System.out.println("A soma da diagonal é de: " + soma);
    }
}