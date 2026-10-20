package exercicios.exercicios12.questao02;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

            new Produto("Teclado", 150.00),
            new Produto("Mouse", 80.00),
            new Produto("Monitor", 900.00),
            new Produto("Headset", 250.00),
            new Produto("Webcam", 200.00),
            new Produto("Notebook", 3500.00)
        );
        
        double total = produtos.stream()
            .mapToDouble(Produto::getPreco)
            .sum(); //somatorio
            
        double media = produtos.stream()
            .mapToDouble(Produto::getPreco)
            .average() //media
            .orElse(0.0);
            
        Optional<Produto> maisCaro = produtos.stream()
            .max(Comparator.comparingDouble(Produto::getPreco));
            
        System.out.printf("Valor total: R$ %.2f%n", total);
        System.out.printf("Preço médio: R$ %.2f%n", media);
        
        maisCaro.ifPresent(produto ->
            System.out.println("Produto mais caro: " + produto)
        );
    }
}
