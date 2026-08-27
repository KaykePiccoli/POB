package exercicios.exercicios01;
import java.util.Scanner;

public class ConversorTempo {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o tempo em segundos: ");
        int segundos = scanner.nextInt();
        int horas = segundos/3600;
        int minutos = (segundos%3600)/60;
        int segundosFinal = (segundos%3600)%60;
        System.out.println("O tempo em horas, minutos e segundos e: " + horas + " horas " + minutos + " minutos e " + segundosFinal + " segundos");

    }
}
