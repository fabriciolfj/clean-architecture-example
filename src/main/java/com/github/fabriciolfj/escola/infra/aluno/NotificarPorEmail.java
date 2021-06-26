package com.github.fabriciolfj.escola.infra.aluno;

import com.github.fabriciolfj.escola.aplicacao.indicacao.Notificar;
import com.github.fabriciolfj.escola.dominio.aluno.Aluno;

public class NotificarPorEmail implements Notificar {
    @Override
    public void send(Aluno aluno) {
        System.out.println("Enviando email: " + aluno.toString());
    }
}
