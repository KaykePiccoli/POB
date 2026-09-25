package exercicios.exercicios08.questao03;

public class Main {

    public static void processarEnvio(Notificacao notificacao, String texto) {
        notificacao.enviar(texto);
    }

    public static void main(String[] args) {

        Notificacao email = new EmailNotificacao("kayke@email.com");
        Notificacao sms = new SmsNotificacao("11999999999");
        Notificacao push = new PushNotificacao("Dispositivo123");

        processarEnvio(email, "Olá! Esta é uma mensagem por E-mail.");
        processarEnvio(sms, "Olá! Esta é uma mensagem por SMS.");
        processarEnvio(push, "Olá! Esta é uma mensagem Push.");
    }
}