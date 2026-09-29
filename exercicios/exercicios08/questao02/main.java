package exercicios.exercicios08.questao02;

public class main {

    public static void main(String[] args) {

        double folhaTotal = 0;

        Funcionario[] funcionarios = new Funcionario[3];

        funcionarios[0] = new Funcionario("Flavia", 3000);
        funcionarios[1] = new Gerente("Ricardo", 5000, 1000);
        funcionarios[2] = new Vendedor("Joana", 2.275, 500, 2.0);

        for (int i = 0; i < funcionarios.length; i++) {
            folhaTotal += funcionarios[i].calcularSalario();
        }

        System.out.println("Folha total: R$ " + folhaTotal);
    }
}