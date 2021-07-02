package com.github.fabriciolfj.escola.academico.dominio.aluno;

import com.github.fabriciolfj.escola.shared.dominio.CPF;

public class FabricaDeAluno {

    private Aluno aluno;

    public FabricaDeAluno comNomeCpfEEmail(final String nome, final String cpf, final String email) {
        if (aluno != null) {
            throw new IllegalArgumentException("Ja iniciado o processo de criação do aluno");
        }

        aluno = new Aluno(nome, new Email(email), new CPF(cpf));
        return this;
    }

    public FabricaDeAluno comTelefone(final String ddd, final String numero) {
        if (this.aluno == null) {
            throw new IllegalArgumentException("Aluno não criado");
        }

        this.aluno.addTelefone(ddd, numero);
        return this;
    }

    public Aluno criar() {
        return this.aluno;
    }
}
