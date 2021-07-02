package com.github.fabriciolfj.escola.shared.aplicacao;

import com.github.fabriciolfj.escola.shared.dominio.Evento;

public abstract class Ouvinte {
    public void execute(final Evento evento) {
        if (isValid(evento)) {
            consumir(evento);
        }
    }

    public abstract void consumir(final Evento evento);
    public abstract boolean isValid(final Evento evento);

}
