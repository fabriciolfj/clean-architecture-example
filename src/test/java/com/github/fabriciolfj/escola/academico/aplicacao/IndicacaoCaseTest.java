package com.github.fabriciolfj.escola.academico.aplicacao;

import com.github.fabriciolfj.escola.academico.aplicacao.aluno.AlunoCase;
import com.github.fabriciolfj.escola.academico.aplicacao.indicacao.IndicacaoCase;
import com.github.fabriciolfj.escola.academico.infra.aluno.AlunoRepositorioMemoria;
import com.github.fabriciolfj.escola.academico.infra.aluno.MatricularAlunoDTO;
import com.github.fabriciolfj.escola.shared.aplicacao.PublisherEvents;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IndicacaoCaseTest {

    private AlunoCase caso = new AlunoCase(new AlunoRepositorioMemoria(), new PublisherEvents());
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
