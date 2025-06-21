package br.com.g4f.teste.alexandre.cadastroAPI.service;

import br.com.g4f.teste.alexandre.cadastroAPI.dto.PessoaCadastroDTO;
import br.com.g4f.teste.alexandre.cadastroAPI.dto.PessoaListarDTO;
import br.com.g4f.teste.alexandre.cadastroAPI.mapper.PessoaMapper;
import br.com.g4f.teste.alexandre.cadastroAPI.pessoa.Pessoa;
import br.com.g4f.teste.alexandre.cadastroAPI.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    private final PessoaRepository pessoaRepository;
    private final PessoaMapper pessoaMapper;

    public PessoaService(PessoaRepository pessoaRepository, PessoaMapper pessoaMapper) {
        this.pessoaRepository = pessoaRepository;
        this.pessoaMapper = pessoaMapper;
    }

    public void cadastrarPessoa(PessoaCadastroDTO pessoaCadastroDTO) {
        pessoaRepository.save(pessoaMapper.pessoaCadastroDTOParaPessoa(pessoaCadastroDTO));
    }

    public List<PessoaListarDTO> listarPessoas(){
        List<Pessoa> listaDePessoa = pessoaRepository.findAll();
        return listaDePessoa.stream().map(PessoaMapper::pessoaParaPessoaListarDTO).toList();
    }

}
