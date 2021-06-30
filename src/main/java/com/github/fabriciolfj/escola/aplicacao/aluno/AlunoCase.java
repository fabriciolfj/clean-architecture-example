package com.github.fabriciolfj.escola.aplicacao.aluno;

import com.github.fabriciolfj.escola.aplicacao.PublisherEvents;
import com.github.fabriciolfj.escola.aplicacao.faturamentoCase.FaturamentoCase;
import com.github.fabriciolfj.escola.aplicacao.log.LogCase;
import com.github.fabriciolfj.escola.dominio.RepositorioDeAlunos;
import com.github.fabriciolfj.escola.dominio.aluno.AlunoEvento;
import com.github.fabriciolfj.escola.infra.aluno.AlunoRepositorioMemoria;
import com.github.fabriciolfj.escola.infra.aluno.MatricularAlunoDTO;

public class AlunoCase {

    private RepositorioDeAlunos repositorio;
    private PublisherEvents publisher;

    public AlunoCase(RepositorioDeAlunos repositorio, PublisherEvents publisher) {
        this.repositorio = repositorio;
        this.publisher = publisher;
    }

    public void execute(final MatricularAlunoDTO dto) {
        var aluno = dto.criarAluno();
        repositorio.matricular(aluno);

        var evento = new AlunoEvento(aluno.getCpfCompleto(), aluno.getNome());
        publisher.addOuvinte(new LogCase());
        publisher.addOuvinte(new FaturamentoCase());

        publisher.processar(evento);
    }
}