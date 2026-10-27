
package exercicios.exercicios09.questao05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static double calcularTotalImpostos(
            List<Tributavel> itensTributaveis) {

        double total = 0;

        for (Tributavel item : itensTributaveis) {
            total += item.calcularTributo();
        }

        return total;
    }

    public static void main(String[] args) {

        List<Item> itens = Arrays.asList(
            new Eletronico(1, 2000.00),
            new Alimento(2, 50.00),
            new Eletronico(3, 500.00),
            new Alimento(4, 30.00)
        );

        List<Tributavel> tributaveis = new ArrayList<>();

        for (Item item : itens) {
            if (item instanceof Tributavel) {
                tributaveis.add((Tributavel) item);
            }
        }

        double total = calcularTotalImpostos(tributaveis);

        System.out.printf(
            "Total de impostos: R$ %.2f%n", total
        );
    }
}
