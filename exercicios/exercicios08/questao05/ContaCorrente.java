package exercicios.exercicios08.questao05;

public class ContaCorrente extends Conta {

private double limiteChequeEspecial;

public ContaCorrente(String numero, double saldo, double limiteChequeEspecial) {
    super(numero, saldo);
    this.limiteChequeEspecial = limiteChequeEspecial;
}

@Override
public void sacar(double valor) {

    double taxa = 2.00;
    double valorTotal = valor + taxa;

    if (valor > 0 && valorTotal <= getSaldo() + limiteChequeEspecial) {

        if (valor <= getSaldo()) {
            super.sacar(valor);
            alterarSaldo(-taxa);
        } else {
            alterarSaldo(-valorTotal);
        }

    } else {
        System.out.println("Saque não permitido. Limite do cheque especial insuficiente.");
    }
}

}
