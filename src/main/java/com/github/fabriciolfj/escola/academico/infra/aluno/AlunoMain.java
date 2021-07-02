package com.github.fabriciolfj.escola.academico.infra.aluno;

import com.github.fabriciolfj.escola.shared.aplicacao.PublisherEvents;
import com.github.fabriciolfj.escola.academico.aplicacao.aluno.AlunoCase;

public class AlunoMain {

    public static void main(String[] args) {
        var dto = new MatricularAlunoDTO("Fabricio", "254.158.960-31", "fabricio@hotmail.com");
        var caso = new AlunoCase(new AlunoRepositorioMemoria(), new PublisherEvents());
        caso.execute(dto);
    }
}
