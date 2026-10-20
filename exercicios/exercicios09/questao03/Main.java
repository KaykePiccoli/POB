
package exercicios.exercicios11.questao03;

public class Main {

    public static void main(String[] args) {

        Usuario usuario = new Usuario("joao", "1234");

        Administrador administrador =
                new Administrador("admin", "abcd", 5);

        System.out.println("Usuário autenticado: "
                + usuario.autenticar("1234"));

        System.out.println("Administrador autenticado: "
                + administrador.autenticar("abcd"));

        System.out.println("Dados do administrador: "
                + administrador.exportarJSON());
    }
}
