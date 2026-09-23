package exercicios.exercicios06.questao1;

class livro {
    String titulo;
    String autor;
    int numeroPaginas;

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
        System.out.println("------------------------");
    }
}