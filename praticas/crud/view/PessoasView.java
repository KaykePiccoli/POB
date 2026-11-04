package praticas.view;

import praticas.crud.controller.PessoasController;
import praticas.crud.model.Pessoas;
import java.util.Scanner;
import java.util.InputMismatchException;

public class PessoasView{
    private PessoasController controller;
    
    private Scanner scanner;

    public PessoasView(PessoasController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }
    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Pessoa");
            System.out.println("2. Listar Pessoas");
            System.out.println("3. Alterar Pessoa");
            System.out.println("4. Excluir Pessoa");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");
            
            opcao = capturarInteiro();

            switch (opcao) {
                case 1 -> adicionarPessoas();
                case 2 -> listarPessoas();
                case 3 -> alterarPessoas();
                case 4 -> excluirPessoas();
                case 0 -> System.out.println("Encerrando o programa.");
                default -> System.out.println("Opcao invalida. Tente novamente.");
            }
        } while (opcao != 0); 
    }

    private void adicionarPessoas() {
        int id = capturarId(); 
        String nome = capturarString("Nome da Pessoa: ");
        int idade = capturarIdade("Idade da Pessoa: ");
        double altura = capturarDouble("Altura da Pessoa: ");
        
        controller.adicionarPessoa(id, nome, idade, altura);
        System.out.println("Pessoa adicionado com sucesso!");
    }

    private void listarPessoas() {
        for (Pessoas pessoas : controller.listarPessoas()) {
            System.out.println("ID: " + pessoas.getId() + ", Nome: " + pessoas.getNome() + ", Idade: " + pessoas.getIdade() + ", Altura: " + pessoas.getAltura());
        }
    }

    private void alterarPessoas() {
        int id = capturarId();
        String novoNome = capturarString("Novo Nome: ");
        int novoIdade = capturarInt("Nova Idade: ");
        double novoAltura = capturarDouble("Nova Altura: ");


        if (controller.alterarPessoas(id, novoNome, novoIdade, novoAltura)) {
            System.out.println("Produto alterado com sucesso!");
        } else {
            System.out.println("Produto com ID " + id + " nao encontrado.");
        }
    }

    private void excluirPessoas() {
        int id = capturarId();
        if (controller.excluirPessoas(id)) {
            System.out.println("Pessoa excluida com sucesso!");
        } else {
            System.out.println("Pessoa com ID " + id + " nao encontrado.");
        }
    }

    private int capturarId() {
        return capturarInteiro("ID do Produto: ");
    }

    private int capturarInteiro() {
        return capturarInteiro(null);
    }

    private int capturarInteiro(String mensagem) {
        int valor = 0;
        boolean valido;
        do {
            try {
                if (mensagem != null) {
                    System.out.print(mensagem); 
                }
                valor = scanner.nextInt(); 
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida. Por favor, insira um numero inteiro.");
                valido = false;
                scanner.nextLine(); 
            }
        } while (!valido);
        scanner.nextLine(); 
        return valor;
    }

    private double capturarDouble(String mensagem) {
        double valor = 0.0;
        boolean valido;
        do {
            try {
                System.out.print(mensagem);
                valor = scanner.nextDouble(); 
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida. Por favor, insira um numero decimal.");
                valido = false;
                scanner.nextLine(); 
            }
        } while (!valido);
        scanner.nextLine(); 
        return valor;
    }

    private String capturarString(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine(); 
    }
}