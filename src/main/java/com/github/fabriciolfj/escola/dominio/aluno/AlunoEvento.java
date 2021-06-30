package com.github.fabriciolfj.escola.dominio.aluno;

import com.github.fabriciolfj.escola.dominio.Evento;

public class AlunoEvento implements Evento {

    private CPF cpf;
    private String nome;

    public AlunoEvento(CPF cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public CPF getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "AlunoEvento{" +
                "cpf=" + cpf +
                ", nome='" + nome + '\'' +
                '}';
    }
}
