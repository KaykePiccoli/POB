package exercicios.exercicios12.questao01;
import java.util.Arrays;
import java.util.List;

    public class Main{
	public static void main(String[] args) {
		 
		 List<String> nomes = Arrays.asList(
            "ana", "carlos", "beatriz",
            "antonio", "amanda", "bernardo"
        );
        
        List<String> resultado = nomes.stream()
            .filter(nome -> nome.toUpperCase().startsWith("A"))
            .map(nome -> nome.toUpperCase())
            .sorted()
            .toList();

        System.out.println(resultado);
    }
}
