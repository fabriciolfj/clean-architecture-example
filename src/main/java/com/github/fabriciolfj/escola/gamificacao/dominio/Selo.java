package com.github.fabriciolfj.escola.gamificacao.dominio;

import com.github.fabriciolfj.escola.shared.dominio.CPF;

public class Selo {

    private String nome;
    private CPF cpf;

    public Selo(String nome, CPF cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CPF getCpf() {
        return cpf;
    }

    public void setCpf(CPF cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Selo{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf.getNumero() +
                '}';
    }
}
