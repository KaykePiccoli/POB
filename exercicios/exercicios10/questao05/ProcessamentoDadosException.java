package exercicios.exercicios10.questao05;

public class ProcessamentoDadosException extends Exception {
    public ProcessamentoDadosException(
            String mensagem, Throwable causa) {

        super(mensagem, causa);
    }
}
