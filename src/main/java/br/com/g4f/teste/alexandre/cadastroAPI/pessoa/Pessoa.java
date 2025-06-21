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
    private LocalDate diaNascimento;
    private String mesNascimento;
    private String anoNascimento;

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDiaNascimento() {
        return diaNascimento;
    }

    public String getMesNascimento() {
        return mesNascimento;
    }

    public String getAnoNascimento() {
        return anoNascimento;
    }
}
