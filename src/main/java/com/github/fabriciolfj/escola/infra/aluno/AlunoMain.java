package com.github.fabriciolfj.escola.infra.aluno;

import com.github.fabriciolfj.escola.aplicacao.aluno.AlunoCase;

public class AlunoMain {

    public static void main(String[] args) {
        var dto = new MatricularAlunoDTO("Fabricio", "254.158.960-31", "fabricio@hotmail.com");
        var caso = new AlunoCase();
        caso.execute(dto);
    }
}
