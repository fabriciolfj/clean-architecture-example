package com.github.fabriciolfj.escola.academico.infra.aluno;

import com.github.fabriciolfj.escola.academico.aplicacao.indicacao.Notificar;
import com.github.fabriciolfj.escola.academico.dominio.aluno.Aluno;

public class NotificarPorEmail implements Notificar {
    @Override
    public void send(Aluno aluno) {
        System.out.println("Enviando email: " + aluno.toString());
    }
}
