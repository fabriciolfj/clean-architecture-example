package com.github.fabriciolfj.escola.dominio.exceptions;

public class FalhaProcessoRepositorio extends RuntimeException {

    public FalhaProcessoRepositorio(final String msg) {
        super(msg);
    }
}
