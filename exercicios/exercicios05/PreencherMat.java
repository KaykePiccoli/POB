package exercicios.exercicios05;
import java.util.Scanner;

public class PreencherMat{
    
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int i, j;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os valores para a matriz 3x3: ");
        for(i=0; i<3; i++) {
            for (j=0; j<3; j++) {
                System.out.printf("Digite o valor para a posição [%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }
        sc.close();

        System.out.println("Matriz:");
        for (i=0; i<3; i++) {
            for (j=0; j<3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(); //quebra de linha
        }
    }
}