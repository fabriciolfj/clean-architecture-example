package com.github.fabriciolfj.escola.academico.aplicacao.aluno;

import com.github.fabriciolfj.escola.shared.aplicacao.PublisherEvents;
import com.github.fabriciolfj.escola.academico.aplicacao.faturamentoCase.FaturamentoCase;
import com.github.fabriciolfj.escola.academico.aplicacao.log.LogCase;
import com.github.fabriciolfj.escola.academico.dominio.RepositorioDeAlunos;
import com.github.fabriciolfj.escola.academico.dominio.aluno.AlunoEvento;
import com.github.fabriciolfj.escola.academico.infra.aluno.MatricularAlunoDTO;

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