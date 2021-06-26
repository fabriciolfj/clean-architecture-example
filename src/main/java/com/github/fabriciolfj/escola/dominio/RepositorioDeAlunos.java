package com.github.fabriciolfj.escola.dominio;

import com.github.fabriciolfj.escola.dominio.aluno.Aluno;
import com.github.fabriciolfj.escola.dominio.aluno.CPF;

import java.util.List;

public interface RepositorioDeAlunos {

    void matricular(final Aluno aluno);

    Aluno buscarPorCpf(final CPF cpf);

    List<Aluno> listaAlunosMatriculados();
}
