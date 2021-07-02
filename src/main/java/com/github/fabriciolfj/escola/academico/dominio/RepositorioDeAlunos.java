package com.github.fabriciolfj.escola.academico.dominio;

import com.github.fabriciolfj.escola.academico.dominio.aluno.Aluno;
import com.github.fabriciolfj.escola.shared.dominio.CPF;

import java.util.List;

public interface RepositorioDeAlunos {

    void matricular(final Aluno aluno);

    Aluno buscarPorCpf(final CPF cpf);

    List<Aluno> listaAlunosMatriculados();
}
