package exercicios.exercicios06.questao3;
public class main{
    public static void Main(String[] args) {

        contaBancaria conta = new contaBancaria("Maria Silva", "12345-6");

        conta.consultarSaldo();                    // Saldo inicial: 0.0

        conta.depositar(500.0);       // Válido
        conta.consultarSaldo();

        conta.sacar(200.0);           // Válido
        conta.consultarSaldo();

        conta.sacar(1000.0);          // Inválido: saldo insuficiente
        conta.depositar(-50.0);                    // Inválido: valor negativo
        conta.sacar(-10.0);                        // Inválido: valor negativo

        conta.consultarSaldo();                    // Saldo final
    }
}