package com.github.fabriciolfj.escola.academico.aplicacao.faturamentoCase;

import com.github.fabriciolfj.escola.shared.aplicacao.Ouvinte;
import com.github.fabriciolfj.escola.shared.dominio.Evento;
import com.github.fabriciolfj.escola.academico.dominio.aluno.AlunoEvento;

public class FaturamentoCase extends Ouvinte {
    @Override
    public void consumir(Evento evento) {
        System.out.println("Boleto gerado para: " + evento.toString());
    }

    @Override
    public boolean isValid(Evento evento) {
        return evento instanceof AlunoEvento;
    }
}
