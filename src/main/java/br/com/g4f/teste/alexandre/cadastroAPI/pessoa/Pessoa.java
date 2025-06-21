package br.com.g4f.teste.alexandre.cadastroAPI.pessoa;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tb-pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cpf;
    private LocalDate nascimento;;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, LocalDate nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDiaNascimento() {
        return nascimento;
    }

}
