package com.github.fabriciolfj.escola.academico.aplicacao.indicacao;

import com.github.fabriciolfj.escola.academico.dominio.aluno.Aluno;

public interface Notificar {

    void send(final Aluno aluno);
}
