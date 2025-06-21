package br.com.g4f.teste.alexandre.cadastroAPI.repository;

import br.com.g4f.teste.alexandre.cadastroAPI.pessoa.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
