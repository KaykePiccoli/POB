package exercicios.exercicios01;
import java.util.Scanner;
public class AreaPerimetro {
    
    //ler base e altura, area= b.h, perimetro= 2*(b+h)
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a base de um retangulo: ");
        int base = scanner.nextInt();
        System.out.println("Informe a altura de um retangulo: ");
        int altura = scanner.nextInt();

        int area = base*altura;
        int perimetro = (base+altura)*2;
        System.out.println("A area do retangulo e:" + area);
        System.out.println("O perimetro do retangulo e:" + perimetro);

    }

}
