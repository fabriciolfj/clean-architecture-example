package com.github.fabriciolfj.escola.gamificacao.aplicacao;

import com.github.fabriciolfj.escola.gamificacao.dominio.Selo;
import com.github.fabriciolfj.escola.gamificacao.repositorio.SeloRepositorio;
import com.github.fabriciolfj.escola.shared.aplicacao.Ouvinte;
import com.github.fabriciolfj.escola.shared.dominio.CPF;
import com.github.fabriciolfj.escola.shared.dominio.Evento;
import com.github.fabriciolfj.escola.shared.dominio.TipoEvento;

public class GeraSeloNovoAluno extends Ouvinte {

    private final SeloRepositorio repo;

    public GeraSeloNovoAluno(SeloRepositorio repo) {
        this.repo = repo;
    }

    @Override
    public void consumir(final Evento evento) {
        var selo = new Selo("Novato", (CPF) evento.values().get("cpf"));
        System.out.println("Selo gerado: " + selo);
        repo.save(selo);
    }

    @Override
    public boolean isValid(Evento evento) {
        return evento.getTipo().equals(TipoEvento.ALUNO_MATRICULADO);
    }
}
