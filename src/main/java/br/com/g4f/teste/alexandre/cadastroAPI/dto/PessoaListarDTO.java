package br.com.g4f.teste.alexandre.cadastroAPI.dto;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class PessoaListarDTO {

    @NotNull
    private String nome;
    @NotNull
    private String cpf;
    @NotNull
    private LocalDate nascimento;

    public PessoaListarDTO() {
    }

    public PessoaListarDTO(String nome, String cpf, LocalDate nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }
}
