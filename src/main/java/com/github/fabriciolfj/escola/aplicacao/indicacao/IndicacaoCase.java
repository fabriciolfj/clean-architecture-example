package com.github.fabriciolfj.escola.aplicacao.indicacao;

import com.github.fabriciolfj.escola.dominio.RepositorioDeAlunos;
import com.github.fabriciolfj.escola.dominio.aluno.CPF;
import com.github.fabriciolfj.escola.dominio.indicacao.Indicacao;
import com.github.fabriciolfj.escola.infra.aluno.AlunoRepositorioMemoria;
import com.github.fabriciolfj.escola.infra.aluno.NotificarPorEmail;

public class IndicacaoCase {

    private RepositorioDeAlunos repositorio = new AlunoRepositorioMemoria();
    private Notificar notificacao = new NotificarPorEmail();

    public void execute(final String cpfAluno, final String cpfAlunoIndicado) {
        var aluno = repositorio.buscarPorCpf(new CPF(cpfAluno));
        var alunoIndicado = repositorio.buscarPorCpf(new CPF(cpfAlunoIndicado));
        var indicacao = new Indicacao(alunoIndicado,aluno);

        System.out.println("Indicacao: " + indicacao);

        notificacao.send(aluno);
    }
}
