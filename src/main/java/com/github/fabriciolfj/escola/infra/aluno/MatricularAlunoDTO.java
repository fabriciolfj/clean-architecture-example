package com.github.fabriciolfj.escola.infra.aluno;

import com.github.fabriciolfj.escola.dominio.aluno.Aluno;
import com.github.fabriciolfj.escola.dominio.aluno.FabricaDeAluno;

public class MatricularAlunoDTO {

    private String nome;
    private String cpf;
    private String email;

    public MatricularAlunoDTO(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public Aluno criarAluno() {
        return new FabricaDeAluno()
                .comNomeCpfEEmail(this.nome, this.cpf, this.email)
                .criar();
    }
}
