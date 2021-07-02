package com.github.fabriciolfj.escola.academico.infra.api;

import com.github.fabriciolfj.escola.shared.aplicacao.PublisherEvents;
import com.github.fabriciolfj.escola.academico.aplicacao.aluno.AlunoCase;
import com.github.fabriciolfj.escola.academico.infra.aluno.AlunoRepositorioMemoria;
import com.github.fabriciolfj.escola.academico.infra.aluno.MatricularAlunoDTO;

public class MatricularAlunoMain {

    public static void main(String[] args) {
        var matricula = new MatricularAlunoDTO("fabricio", "999.377.350-68", "fabricio.jacob@outlook.com");
        var caseAluno= new AlunoCase(new AlunoRepositorioMemoria(), new PublisherEvents());
        caseAluno.execute(matricula);
    }
}
