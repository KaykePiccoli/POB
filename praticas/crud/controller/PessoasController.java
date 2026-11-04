package praticas.crud.controller;

import praticas.crud.model.Pessoas;
import java.io.*;
import java.util.ArrayList;

@SuppressWarnings("unused")

public class PessoasController{

    private ArrayList<Pessoas> pessoas;

    private PessoasRepository pessoasRepository;

    public PessoasController(){
        this.pessoasRepository = new PessoasRepository();
        this.pessoas = pessoasRepository.carregarPessoas();
    }

    public ArrayList<Pessoas> listarPessoas(){
        return new ArrayList<>(pessoas);
    }

    public void adicionarPessoas(Int id, String nome, Int idade, Double altura) {
        Pessoas pessoas = new Pessoas(id, nome, idade, altura); 
        pessoas.add(pessoas); 
        pessoasRepository.salvarPessoas(pessoas); 
    }

    public boolean alterarProduto(Int id, String novoNome, Int novoIdade, Double novoAltura) 
    {
        Pessoas pessoas = buscarPessoaPorId(id); // Procura o produto na lista
        if (pessoa != null) // Se encontrado...
        { 
            pessoa.setNome(novoNome); // Atualiza o nome
            pessoa.setIdade(novoIdade); // Atualiza a idade
            pessoa.setAltura(novoAltura); //Atualiza Aatura

            pessoaRepository.salvarPessoas(pessoas); // Salva as alterações no arquivo
            return true;
        }
        return false; // Produto não encontrado
    }

    public boolean excluirPessoas(int id) {
        Pessoas pessoas = buscarPessoaPorId(id); 
        if (pessoa != null) {
            pessoas.remove(pessoas); 
            pessoasRepository.salvarPessoas(pessoas); 
            return true;
        }
        return false; 
    }

    private Produto buscarProdutoPorId(int id) {
        for (Pessoas pessoas : pessoas) {
            if (pessoas.getId() == id) {
                return pessoas;
            }
        }
        return null; 
    }
}