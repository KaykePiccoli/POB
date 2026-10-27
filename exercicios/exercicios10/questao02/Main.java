package exercicios.exercicios10.questao02;
import java.util.Scanner;

public class Main{

    public static void main (String[] args){
        String[] opcoes = {"42b", "157", "pob", "123%"};
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um índice para ser acessado e transferido: ");
        int a=sc.nextInt();

         try {
            String valor = opcoes[a];

            int numero = Integer.parseInt(valor);

            System.out.println("numero convertido: " + numero);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("indice invalido");

        } catch (NumberFormatException e) {
            System.out.println("o valor nao eh um numero inteiro");

    }
}