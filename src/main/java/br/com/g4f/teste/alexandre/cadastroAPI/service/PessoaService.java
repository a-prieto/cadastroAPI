package br.com.g4f.teste.alexandre.cadastroAPI.service;

import br.com.g4f.teste.alexandre.cadastroAPI.pessoa.Pessoa;
import br.com.g4f.teste.alexandre.cadastroAPI.repository.PessoaRepository;

import java.util.List;

public class PessoaService {

    private PessoaRepository pessoaRepository;

    public void cadastrarPessoa(Pessoa pessoa) {
        pessoaRepository.save(pessoa);
    }

    public List<Pessoa> listarPessoas(){
        return pessoaRepository.findAll();
    }


}
