package com.github.fabriciolfj.escola.infra.api;

import com.github.fabriciolfj.escola.aplicacao.PublisherEvents;
import com.github.fabriciolfj.escola.aplicacao.aluno.AlunoCase;
import com.github.fabriciolfj.escola.infra.aluno.AlunoRepositorioMemoria;
import com.github.fabriciolfj.escola.infra.aluno.MatricularAlunoDTO;

public class MatricularAlunoMain {

    public static void main(String[] args) {
        var matricula = new MatricularAlunoDTO("fabricio", "999.377.350-68", "fabricio.jacob@outlook.com");
        var caseAluno= new AlunoCase(new AlunoRepositorioMemoria(), new PublisherEvents());
        caseAluno.execute(matricula);
    }
}
