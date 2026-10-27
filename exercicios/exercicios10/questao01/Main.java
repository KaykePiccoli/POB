package exercicios.exercicios10.questao01;
import java.util.Scanner;

public class Main{

    public static void main (String[] args){
        int result, x,y;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número: ");
        x= sc.nextInt();
        System.out.println("Informe outro número distinto");
        y= sc.nextInt();

        try{
            result=x/y;

        } catch(ArithmeticException){
            System.out.println("Não é possível dividir por zero");
        } catch(InputMismatchException){
            System.out.println("Número não utilizados na conta");
        } finally{
            sc.close();
            System.out.println("Operação realizada com sucesso");
        }

        System.out.println("O resultado desta divisão é de "+result);
    }
}