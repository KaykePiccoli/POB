package exercicios.exercicios08.questao03;

public class Notificacao {

    protected String destinatario;

    public Notificacao(String destinatario) {
        this.destinatario = destinatario;
    }

    public void enviar(String mensagem) {
        System.out.println("Enviando notificação para " + destinatario + ": " + mensagem);
    }
}