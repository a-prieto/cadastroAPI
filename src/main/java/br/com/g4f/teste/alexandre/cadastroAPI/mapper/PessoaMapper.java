package br.com.g4f.teste.alexandre.cadastroAPI.mapper;

import br.com.g4f.teste.alexandre.cadastroAPI.dto.PessoaCadastroDTO;
import br.com.g4f.teste.alexandre.cadastroAPI.dto.PessoaListarDTO;
import br.com.g4f.teste.alexandre.cadastroAPI.pessoa.Pessoa;
import org.springframework.stereotype.Component;

@Component
public class PessoaMapper {

    public Pessoa pessoaCadastroDTOParaPessoa(PessoaCadastroDTO pessoaCadastroDTO){
        Pessoa pessoa = new Pessoa(pessoaCadastroDTO.getNome(),
                pessoaCadastroDTO.getCpf(),
                pessoaCadastroDTO.getNascimento()
        );

        return pessoa;

    }

    public static PessoaListarDTO pessoaParaPessoaListarDTO(Pessoa pessoa){
        PessoaListarDTO pessoaListarDTo = new PessoaListarDTO(
                pessoa.getNome(),
                pessoa.getCpf(),
                pessoa.getDiaNascimento()
        );

        return pessoaListarDTo;

    }
}
