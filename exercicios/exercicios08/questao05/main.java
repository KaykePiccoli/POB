package exercicios.exercicios08.questao05;

public class main {

    public static void main(String[] args) {

        ContaPoupanca poupanca =
                new ContaPoupanca("001", 1000.00, 5.0);

        ContaCorrente corrente =
                new ContaCorrente("002", 500.00, 1000.00);

        System.out.println("Conta Poupança");

        System.out.printf("Saldo inicial: R$ %.2f%n",
                poupanca.getSaldo());

        poupanca.depositar(200.00);

        System.out.printf("Após depósito: R$ %.2f%n",
                poupanca.getSaldo());

        poupanca.aplicarRendimento();

        System.out.printf("Após rendimento: R$ %.2f%n",
                poupanca.getSaldo());

        poupanca.sacar(300.00);

        System.out.printf("Após saque: R$ %.2f%n",
                poupanca.getSaldo());

        System.out.println();

        System.out.println("Conta Corrente");

        System.out.printf("Saldo inicial: R$ %.2f%n",
                corrente.getSaldo());

        corrente.depositar(100.00);

        System.out.printf("Após depósito: R$ %.2f%n",
                corrente.getSaldo());

        corrente.sacar(700.00);

        System.out.printf("Após saque: R$ %.2f%n",
                corrente.getSaldo());
    }
}

class ContaPoupanca {
    private String numero;
    private double saldo;
    private double taxaRendimento;

    public ContaPoupanca(String numero, double saldoInicial, double taxaRendimento) {
        this.numero = numero;
        this.saldo = saldoInicial;
        this.taxaRendimento = taxaRendimento;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void aplicarRendimento() {
        saldo += saldo * (taxaRendimento / 100.0);
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
        }
    }
}

class ContaCorrente {
    private String numero;
    private double saldo;
    private double limiteChequeEspecial;

    public ContaCorrente(String numero, double saldoInicial, double limiteChequeEspecial) {
        this.numero = numero;
        this.saldo = saldoInicial;
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo - valor >= -limiteChequeEspecial) {
            saldo -= valor;
        }
    }
}
