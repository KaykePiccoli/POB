package exercicios.exercicios10.questao03;

public class ContaCorrente {

    private String numero;
    private double saldo;

    public ContaCorrente(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void sacar(double valor)
            throws SaldoInsuficienteException {

        if (valor > saldo) {
            throw new SaldoInsuficienteException(
                "Saldo insuficiente Saldo disponível: R$ "
                + saldo
            );
        }

        if (valor <= 0) {
            throw new IllegalArgumentException(
                "O valor do saque tem q ser positivo"
            );
        }

        saldo -= valor;

        System.out.println("Saque realizado: R$ " + valor);
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumero() {
        return numero;
    }
}
