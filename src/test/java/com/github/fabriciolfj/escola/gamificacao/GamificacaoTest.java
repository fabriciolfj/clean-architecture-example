package com.github.fabriciolfj.escola.gamificacao;

import com.github.fabriciolfj.escola.academico.aplicacao.aluno.AlunoCase;
import com.github.fabriciolfj.escola.academico.dominio.RepositorioDeAlunos;
import com.github.fabriciolfj.escola.academico.dominio.aluno.AlunoEvento;
import com.github.fabriciolfj.escola.academico.infra.aluno.AlunoRepositorioMemoria;
import com.github.fabriciolfj.escola.academico.infra.aluno.MatricularAlunoDTO;
import com.github.fabriciolfj.escola.gamificacao.aplicacao.GeraSeloNovoAluno;
import com.github.fabriciolfj.escola.gamificacao.repositorio.impl.SeloRepositorioImpl;
import com.github.fabriciolfj.escola.shared.aplicacao.PublisherEvents;
import com.github.fabriciolfj.escola.shared.dominio.CPF;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GamificacaoTest {

    private RepositorioDeAlunos repositorioDeAlunos = new AlunoRepositorioMemoria();

    @Test
    public void criarSelos() {
        var evento = new AlunoEvento(new CPF("113.664.920-48"), "Fabricio");
        var publisher = new PublisherEvents();
        publisher.addOuvinte(new GeraSeloNovoAluno(new SeloRepositorioImpl()));
        publisher.processar(evento);
    }
}
