package br.com.g4f.teste.alexandre.cadastroAPI.controller;

import br.com.g4f.teste.alexandre.cadastroAPI.pessoa.DadosCadastroPessoa;
import br.com.g4f.teste.alexandre.cadastroAPI.pessoa.Pessoa;
import br.com.g4f.teste.alexandre.cadastroAPI.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")

public class PessoaController {
    @Autowired
    private PessoaRepository pessoaRepository;

    @PostMapping
    public Pessoa cadastrarPessoa (@RequestBody Pessoa pessoa){
        return pessoaRepository.save(pessoa);

    }

    @GetMapping
    public List<Pessoa> listaPessoas(){
        return pessoaRepository.findAll();
    }

}
