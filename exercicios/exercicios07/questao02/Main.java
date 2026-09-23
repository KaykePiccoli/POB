package exercicios.exercicios07.questao02;

public class Main {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("00123-4", "Carlos Mendes");

        System.out.println("Número da conta: " + conta.getNumeroConta());
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo inicial: " + conta.getSaldo());

        conta.depositar(1000.0);
        System.out.println("Saldo após depósito: " + conta.getSaldo());

        conta.sacar(300.0);
        System.out.println("Saldo após saque: " + conta.getSaldo());

        conta.setTitular("Carlos Eduardo Mendes");
        System.out.println("Titular atualizado: " + conta.getTitular());
    }
}
