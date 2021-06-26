package com.github.fabriciolfj.escola.aplicacao;

import com.github.fabriciolfj.escola.aplicacao.aluno.AlunoCase;
import com.github.fabriciolfj.escola.aplicacao.indicacao.IndicacaoCase;
import com.github.fabriciolfj.escola.infra.aluno.MatricularAlunoDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IndicacaoCaseTest {

    private AlunoCase caso = new AlunoCase();
    private String cpf = "254.158.960-31";
    private String cpf2 = "102.490.670-13";

    @BeforeEach
    public void setup() {
        MatricularAlunoDTO dto = new MatricularAlunoDTO("Fabricio", cpf, "fabricio@hotmail.com");
        MatricularAlunoDTO dto2 = new MatricularAlunoDTO("Fabricio", cpf2, "fabricio@hotmail.com");
        caso.execute(dto);
        caso.execute(dto2);
    }

    @Test
    public void indicacaoComSucesso() {
        var caseIndicacao = new IndicacaoCase();
        caseIndicacao.execute(cpf, cpf2);
    }
}
