package exercicios.exercicios08.questao02;

public class Main {

    public static void main (String[] args){

        double folhatotal=0;

        Funcionario[] funcionarios = new Funcionarios[3];
        Funcionario[0] = new Funcionario ("Flavia", 3000);
        Funcionario[1] = new Gerente ("Ricardo", 5000, 1000);
        Funcionario[2] = new Vendedor ("Joana", 2275, 500, 2.0);
        
        for (int i = 0; i < funcionarios.length; i++) {
            folhaTotal += funcionarios[i].calcularSalario();
        } 

        System.out.println("Folha total: R$ " + folhaTotal);
    }
}