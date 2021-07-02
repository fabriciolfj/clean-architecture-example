package com.github.fabriciolfj.escola.academico.aplicacao.indicacao;

import com.github.fabriciolfj.escola.academico.dominio.RepositorioDeAlunos;
import com.github.fabriciolfj.escola.shared.dominio.CPF;
import com.github.fabriciolfj.escola.academico.dominio.indicacao.Indicacao;
import com.github.fabriciolfj.escola.academico.infra.aluno.AlunoRepositorioMemoria;
import com.github.fabriciolfj.escola.academico.infra.aluno.NotificarPorEmail;

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
