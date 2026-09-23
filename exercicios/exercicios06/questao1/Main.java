package exercicios.exercicios06.questao1;
public class Main {

    public static void main(String[] args) {

        // Instanciando o primeiro objeto Livro
        livro livro1 = new livro();
        livro1.setTitulo("Dom Casmurro");
        livro1.setAutor("Machado de Assis");
        livro1.setNumeroPaginas(256);

        // Instanciando o segundo objeto Livro
        livro livro2 = new livro();
        livro2.setTitulo("O Hobbit");
        livro2.setAutor("J.R.R. Tolkien");
        livro2.setNumeroPaginas(310);

        // Exibindo as informações de ambos
        livro1.exibirInformacoes();
        livro2.exibirInformacoes();
    }
}