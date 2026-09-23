package exercicios.exercicios06.questao3;
public class contaBancaria {

    private String titular;
    private String numeroConta;
    private double saldo;

    public contaBancaria(String titular, String numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual de " + titular + ": R$" + saldo);
    }
}