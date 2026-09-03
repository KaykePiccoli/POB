package exercicios.exercicios04;
import java.util.Scanner;
public class BuscaLinear {
    
    public static void main(String [] args){
        int i;
        int[] vetor = {2, 3, 8, 10, 7, 9};

        Scanner sc = new Scanner(System.in);
        System.out.println("Forneça um numero para ser varrer no vetor: ");
        int valor = sc.nextInt();
        sc.close();

        for(i=0; i<6; i++){
            if(vetor[i]==valor){
                i++;
                System.out.println("Valor encontrado na posição: " + i);
                break;
            }
            else {
                if((i== 5) && (i!=valor)){
                System.out.println("Não existe esse valor dentro do vetor!");
                break;
                }
            }
        }       
}
}