package exercicios.exercicios06.questao1;
public class main {

    public static void Main(String[] args) {

        livro livro1 = new livro();
        livro1.setTitulo("Dom Casmurro");
        livro1.setAutor("Machado de Assis");
        livro1.setNumeroPaginas(256);

        livro livro2 = new livro();
        livro2.setTitulo("O Hobbit");
        livro2.setAutor("J.R.R. Tolkien");
        livro2.setNumeroPaginas(310);

        livro1.exibirInformacoes();
        livro2.exibirInformacoes();
    }
}