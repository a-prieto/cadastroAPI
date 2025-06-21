package br.com.g4f.teste.alexandre.cadastroAPI.controller;

import br.com.g4f.teste.alexandre.cadastroAPI.pessoa.Pessoa;
import br.com.g4f.teste.alexandre.cadastroAPI.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")

public class PessoaController {
    @Autowired
    private PessoaService pessoaService;

    @PostMapping
    public ResponseEntity<?> cadastrarPessoa (@RequestBody Pessoa pessoa){
        pessoaService.cadastrarPessoa(pessoa);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<?> listaPessoas(){
        List<Pessoa> listaDePessoas = pessoaService.listarPessoas();
        return ResponseEntity.status(HttpStatus.OK).body(listaDePessoas);

    }

}
