package exercicios.exercicios08.questao05;

public class Conta {

private String numero;
private double saldo;

public Conta(String numero, double saldo) {
    this.numero = numero;
    this.saldo = saldo;
}

public void depositar(double valor) {
    if (valor > 0) {
        saldo += valor;
    }
}

public void sacar(double valor) {
    if (valor > 0 && valor <= saldo) {
        saldo -= valor;
    } else {
        System.out.println("Saque não permitido.");
    }
}

protected void alterarSaldo(double valor) {
    saldo += valor;
}

public double getSaldo() {
    return saldo;
}

public String getNumero() {
    return numero;
}


}
