package com.github.fabriciolfj.escola.academico.dominio.indicacao;

import com.github.fabriciolfj.escola.academico.dominio.aluno.Aluno;

import java.time.LocalDateTime;

public class Indicacao {

    private Aluno indicado;
    private Aluno indicante;
    private LocalDateTime dataIndicacao;

    public Indicacao(Aluno indicado, Aluno indicante) {
        this.indicado = indicado;
        this.indicante = indicante;
        this.dataIndicacao = LocalDateTime.now();
    }

    public Aluno getIndicado() {
        return indicado;
    }

    public Aluno getIndicante() {
        return indicante;
    }

    public LocalDateTime getDataIndicacao() {
        return dataIndicacao;
    }

    @Override
    public String toString() {
        return "Indicacao{" +
                "indicado=" + indicado +
                ", indicante=" + indicante +
                ", dataIndicacao=" + dataIndicacao +
                '}';
    }
}
