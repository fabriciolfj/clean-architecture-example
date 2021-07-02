package com.github.fabriciolfj.escola.gamificacao.repositorio.impl;

import com.github.fabriciolfj.escola.shared.dominio.CPF;
import com.github.fabriciolfj.escola.gamificacao.dominio.Selo;
import com.github.fabriciolfj.escola.gamificacao.repositorio.SeloRepositorio;

import java.util.ArrayList;
import java.util.List;

public class SeloRepositorioImpl implements SeloRepositorio {

    private final static List<Selo> base = new ArrayList<>();

    @Override
    public void save(final Selo selo) {
        base.add(selo);
    }

    @Override
    public Selo find(final CPF cpf) {
        return base
                .stream()
                .filter(c -> c.getCpf().getNumero().equals(cpf.getNumero()))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Selo not found"));
    }
}
