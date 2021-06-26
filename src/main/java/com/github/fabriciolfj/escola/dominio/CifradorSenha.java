package com.github.fabriciolfj.escola.dominio;

public interface CifradorSenha {

    String cifrarSenha(final String senha);

    boolean validarSenhaCifrada(final String senhaCifrada, final String senha);
}
