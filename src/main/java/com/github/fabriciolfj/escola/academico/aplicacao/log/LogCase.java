package com.github.fabriciolfj.escola.academico.aplicacao.log;

import com.github.fabriciolfj.escola.shared.aplicacao.Ouvinte;
import com.github.fabriciolfj.escola.shared.dominio.Evento;
import com.github.fabriciolfj.escola.academico.dominio.aluno.AlunoEvento;

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
