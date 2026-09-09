package exercicios.exercicios05;
import java.util.Scanner;

public class MatrizTransposta{
    
    public static void main(String[] args) {
        int[][] matrizA = new int[2][3];
        int[][] matrizB = new int[3][2];
        int i, j;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os valores para a matriz 3x3: ");
        for(i=0; i<2; i++) {
            for (j=0; j<3; j++) {
                System.out.printf("Digite o valor para a posição [%d][%d]: ", i, j);
                matrizA[i][j] = sc.nextInt();
            }
        }
        sc.close();

        System.out.println("Matriz A:");
        for (i=0; i<2; i++) {
            for (j=0; j<3; j++) {
                System.out.print(matrizA[i][j] + "\t");
            }
            System.out.println(); //quebra de linha
        }

        //linha -> coluna, coluna -> linha, 3x2.
       for(i=0; i<3; i++){
            for(j=0; j<2; j++){
                matrizB[i][j]=matrizA[j][i];
            }
       }

       System.out.println("Matriz A^:");
        for (i=0; i<3; i++) {
            for (j=0; j<2; j++) {
                System.out.print(matrizB[i][j] + "\t");
            }
            System.out.println(); //quebra de linha
        }
    }
}