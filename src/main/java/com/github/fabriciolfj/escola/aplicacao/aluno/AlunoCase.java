package com.github.fabriciolfj.escola.aplicacao.aluno;

import com.github.fabriciolfj.escola.dominio.RepositorioDeAlunos;
import com.github.fabriciolfj.escola.infra.aluno.AlunoRepositorioMemoria;
import com.github.fabriciolfj.escola.infra.aluno.MatricularAlunoDTO;

public class AlunoCase {

    private RepositorioDeAlunos repositorio = new AlunoRepositorioMemoria();

    public void execute(final MatricularAlunoDTO dto) {
        repositorio.matricular(dto.criarAluno());
    }
}
