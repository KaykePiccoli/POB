package exercicios.exercicios05;
import java.util.Scanner;

public class MaiorElemento{
    
    public static void main(String[] args) {
        double[][] matriz = new double[3][4];
        int i, j, linhaMaior=0, colunaMaior=0; 
        double maior;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os valores para a matriz 3x4: ");
        for(i=0; i<3; i++) {
            for (j=0; j<4; j++) {
                System.out.printf("Digite o valor para a posição [%d][%d]: ", i+1, j+1);
                matriz[i][j] = sc.nextInt();
            }
        }
        sc.close();

        maior=matriz[0][0];
        for(i=0; i<3; i++) {
            for (j=0; j<4; j++) {
                if(matriz[i][j]>=maior){
                    maior=matriz[i][j];
                    linhaMaior=i+1;
                    colunaMaior=j+1;
                }
            }
        }

        System.out.println("O maior valor da matriz fica na linha " + linhaMaior + " e na coluna " + colunaMaior);
    }
}