package com.github.fabriciolfj.escola.academico.dominio.aluno;

public class Telefone {

    private String ddd;
    private String numero;

    public Telefone(final String ddd, final String numero) {
        if ((ddd == null || ddd.length() != 3) || (numero == null || numero.length() != 9)) {
            throw new IllegalArgumentException("Telefone invalido");
        }

        this.ddd = ddd;
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumero() {
        return numero;
    }
}
