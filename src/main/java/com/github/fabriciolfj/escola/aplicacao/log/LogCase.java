package com.github.fabriciolfj.escola.aplicacao.log;

import com.github.fabriciolfj.escola.aplicacao.Ouvinte;
import com.github.fabriciolfj.escola.dominio.Evento;
import com.github.fabriciolfj.escola.dominio.aluno.AlunoEvento;

public class LogCase extends Ouvinte {

    @Override
    public void consumir(final Evento evento) {
        System.out.println("Log: " + evento);
    }

    @Override
    public boolean isValid(final Evento evento) {
        return evento instanceof AlunoEvento;
    }
}
