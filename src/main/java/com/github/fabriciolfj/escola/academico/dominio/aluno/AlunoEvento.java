package com.github.fabriciolfj.escola.academico.dominio.aluno;

import com.github.fabriciolfj.escola.shared.dominio.Evento;
import com.github.fabriciolfj.escola.shared.dominio.CPF;
import com.github.fabriciolfj.escola.shared.dominio.TipoEvento;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

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

    @Override
    public LocalDateTime momento() {
        return LocalDateTime.now();
    }

    @Override
    public TipoEvento getTipo() {
        return TipoEvento.ALUNO_MATRICULADO;
    }

    @Override
    public Map<String, Object> values() {
        return Map.of("cpf", this.cpf);
    }
}
