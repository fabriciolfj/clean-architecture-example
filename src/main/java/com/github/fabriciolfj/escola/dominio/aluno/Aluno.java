package com.github.fabriciolfj.escola.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private String nome;
    private Email email;
    private CPF cpf;
    private List<Telefone> telefones = new ArrayList<>();

    public Aluno(final String nome, final Email email, final CPF cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    public void addTelefone(final String ddd, final String numero) {
        this.telefones.add(new Telefone(ddd, numero));
    }

    public String getNome() {
        return nome;
    }

    public Email getEmail() {
        return email;
    }

    public CPF getCpf() {
        return cpf;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }
}
