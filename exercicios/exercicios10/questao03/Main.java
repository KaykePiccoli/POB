package exercicios.exercicios10.questao03;

public class Main {

    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente("001", 1000.00);

        System.out.println("Conta: " + conta.getNumero());
        System.out.println("Saldo inicial: R$ " + conta.getSaldo());

        try {
            conta.sacar(300.00);
            conta.sacar(900.00);

        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());

        } finally {
            System.out.println("Operação bancária finalizada.");
        }

        System.out.println("Saldo final: R$ " + conta.getSaldo());
    }
}
