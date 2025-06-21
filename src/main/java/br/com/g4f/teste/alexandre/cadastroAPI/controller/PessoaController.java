package br.com.g4f.teste.alexandre.cadastroAPI.controller;

import br.com.g4f.teste.alexandre.cadastroAPI.dto.PessoaCadastroDTO;
import br.com.g4f.teste.alexandre.cadastroAPI.dto.PessoaListarDTO;
import br.com.g4f.teste.alexandre.cadastroAPI.service.PessoaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")

public class PessoaController {

    private PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @PostMapping
    public ResponseEntity<?> cadastrarPessoa (@RequestBody PessoaCadastroDTO pessoaDTO){
        pessoaService.cadastrarPessoa(pessoaDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<List<PessoaListarDTO>> listaPessoas(){
        List<PessoaListarDTO> listaDePessoas = pessoaService.listarPessoas();
        return ResponseEntity.status(HttpStatus.OK).body(listaDePessoas);

    }

}
