package exercicios.exercicios06;

public class ClasseBanco{
    String titular;
    String numeroConta;
    double saldo = 0;

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }
}

class Main{
    public static void main(String[] args) {
        ClasseBanco conta = new ClasseBanco();
        conta.titular = "Maria Silva";
        conta.numeroConta = "12345-6";

        conta.consultarSaldo();       // Saldo atual: 0.0

        conta.depositar(500.0);       // válido
        conta.consultarSaldo();       // Saldo atual: 500.0

        conta.sacar(200.0);           // válido
        conta.consultarSaldo();       // Saldo atual: 300.0

        conta.sacar(1000.0);          // inválido (saldo insuficiente)
        conta.depositar(-50.0);       // inválido (valor negativo)

        conta.consultarSaldo();       // Saldo atual: 300.0 (inalterado)
    }
}
