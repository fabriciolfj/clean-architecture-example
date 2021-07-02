package com.github.fabriciolfj.escola.academico.dominio.aluno;

public class Email {

    private String email;

    public Email(final String email) {
        if (email == null || !email.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            throw new IllegalArgumentException("Email invalido");
        }

        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
