package exercicios.exercicios03;
import java.util.Scanner;

public class validacao {
    
    public static void main(String[] args){
        int senha = 1210;
        int tentativa = 0;
        Scanner scanner = new Scanner(System.in);

        while (senha != tentativa){
            System.out.println("Informe a senha:");
            tentativa = scanner.nextInt();

            if (tentativa == senha){
                System.out.println("Acesso Permitido!");
                break;
            } else{
                System.out.println("Senha incorreta, tente novamente!");
            }

        }
        scanner.close();
    }
}
