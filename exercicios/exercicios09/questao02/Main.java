package exercicios.exercicios09.questao02;

public class Main {

    public static void main(String[] args) {

        // Forma forma = new Forma("Azul");  // não compila: Forma é abstrata

        Forma retangulo = new Retangulo("Azul", 5.0, 3.0);
        Forma circulo = new Circulo("Vermelho", 2.0);

        Forma[] formas = { retangulo, circulo };

        for (Forma f : formas) {
            f.exibirCor();
            System.out.printf("Área: %.2f%n", f.calcularArea());
            System.out.println("----------------------------");
        }
    }
}