
package exercicios.exercicios10.questao04;
public class Main {

    public static void main(String[] args) {

        Eleitor eleitor = new Eleitor();

        int[] idades = {20, -5, 45, 150};
        String[] nomes = {"Ana", "Carlos", "Beatriz", "Daniel"};

        for (int i = 0; i < idades.length; i++) {
            try {
                eleitor.cadastrar(nomes[i], idades[i]);

            } catch (IdadeInvalidaException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}
