package br.com.g4f.teste.alexandre.cadastroAPI.pessoa;

import jakarta.persistence.*;

@Entity
@Table(name = "tb-pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cpf;
    private String dia;
    private String mes;
    private String ano;

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDia() {
        return dia;
    }

    public String getMes() {
        return mes;
    }

    public String getAno() {
        return ano;
    }
}
