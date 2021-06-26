package com.github.fabriciolfj.escola.infra.aluno;

import com.github.fabriciolfj.escola.dominio.RepositorioDeAlunos;
import com.github.fabriciolfj.escola.dominio.aluno.Aluno;
import com.github.fabriciolfj.escola.dominio.aluno.CPF;
import com.github.fabriciolfj.escola.dominio.exceptions.AlunoNaoEncontrado;

import java.util.ArrayList;
import java.util.List;

public class AlunoRepositorioMemoria implements RepositorioDeAlunos {

    private static final List<Aluno> matriculados = new ArrayList<>();

    @Override
    public void matricular(final Aluno aluno) {
        matriculados.add(aluno);
    }

    @Override
    public Aluno buscarPorCpf(final CPF cpf) {
        return matriculados
                .stream()
                .filter(p -> p.getCpf().equals(cpf))
                .findFirst()
                .orElseThrow(() -> new AlunoNaoEncontrado("Aluno não encontrado para o cpf: " + cpf));
    }

    @Override
    public List<Aluno> listaAlunosMatriculados() {
        return matriculados;
    }
}
