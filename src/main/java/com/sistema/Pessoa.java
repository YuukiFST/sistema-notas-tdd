package com.sistema;

public class Pessoa {
    private String nome;
    private String sobrenome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio");
        }
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        if (sobrenome == null || sobrenome.trim().isEmpty()) {
            throw new IllegalArgumentException("Sobrenome não pode ser nulo ou vazio");
        }
        this.sobrenome = sobrenome;
    }
}
