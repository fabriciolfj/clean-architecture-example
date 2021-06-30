package com.github.fabriciolfj.escola.aplicacao.faturamentoCase;

import com.github.fabriciolfj.escola.aplicacao.Ouvinte;
import com.github.fabriciolfj.escola.dominio.Evento;
import com.github.fabriciolfj.escola.dominio.aluno.AlunoEvento;

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
