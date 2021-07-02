package com.github.fabriciolfj.escola.shared.aplicacao;

import com.github.fabriciolfj.escola.shared.dominio.Evento;

import java.util.ArrayList;
import java.util.List;

public class PublisherEvents {

    private List<Ouvinte> ouvintes = new ArrayList<>();

    public void addOuvinte(final Ouvinte ouvinte) {
        ouvintes.add(ouvinte);
    }

    public void processar(Evento evento) {
        this.ouvintes.forEach(o -> o.execute(evento));
    }
}
