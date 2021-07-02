package com.github.fabriciolfj.escola.gamificacao.repositorio;

import com.github.fabriciolfj.escola.shared.dominio.CPF;
import com.github.fabriciolfj.escola.gamificacao.dominio.Selo;

public interface SeloRepositorio {

    void save(final Selo selo);
    Selo find(final CPF cpf);
}
