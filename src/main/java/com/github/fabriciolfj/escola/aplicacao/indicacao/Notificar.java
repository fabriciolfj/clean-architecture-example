package com.github.fabriciolfj.escola.aplicacao.indicacao;

import com.github.fabriciolfj.escola.dominio.aluno.Aluno;

public interface Notificar {

    void send(final Aluno aluno);
}
