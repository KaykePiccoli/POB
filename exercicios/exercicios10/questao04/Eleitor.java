package exercicios.exercicios10.questao04;

public class Eleitor {
    public void cadastrar(String nome, int idade) {

        if (idade < 0 || idade > 130) {
            throw new IdadeInvalidaException(
                "Idade inválida: " + idade + ". A idade deve estar entre 0 e 130 anos"
            );
        }

        System.out.println(
            "Eleitor cadastrado: " + nome + " | Idade: " + idade
        );
    }
}
