package praticas.crud.controller;

import praticas.crud.model.Pessoas;
import java.io.*;
import java.util.ArrayList;

@SuppressWarnings("unused")
public class PessoasRepository{

    private final String arquivosPessoas = "pessoas.csv";

    // Método responsável por salvar a lista de produtos no arquivo
    public void salvarPessoas(ArrayList<Pessoas> pessoas) 
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoPessoas))){
            for (Pessoas pessoa : pessoa){
                writer.write(pessoa.toFileString());
                writer.newLine(); //quebra de linha
            }
        } 

        catch (IOException e){
            System.out.println("Erro ao salvar pessoas: " + e.getMessage());
        }
    }

    public ArrayList<Pessoas> carregarPessoas() {
        ArrayList<Pessoas> pessoas = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(arquivoProdutos))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                pessoas.add(Pessoas.fromFileString(linha));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo de pessoas não encontrado. Será criado ao salvar novas pessoas.");
        } catch (IOException e) {
            System.out.println("Erro ao carregar pessoas: " + e.getMessage());
        }

        return pessoas;
    }
}