package com.github.fabriciolfj.escola.academico.aplicacao;

import com.github.fabriciolfj.escola.academico.aplicacao.aluno.AlunoCase;
import com.github.fabriciolfj.escola.academico.dominio.RepositorioDeAlunos;
import com.github.fabriciolfj.escola.academico.infra.aluno.AlunoRepositorioMemoria;
import com.github.fabriciolfj.escola.academico.infra.aluno.MatricularAlunoDTO;
import com.github.fabriciolfj.escola.shared.aplicacao.PublisherEvents;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AlunoCaseTest {

    private RepositorioDeAlunos repositorioDeAlunos = new AlunoRepositorioMemoria();

    @Test
    public void criarAlunoComSucesso() {
        var dto = new MatricularAlunoDTO("Fabricio", "254.158.960-31", "fabricio@hotmail.com");
        var caso = new AlunoCase(new AlunoRepositorioMemoria(), new PublisherEvents());
        caso.execute(dto);

        assertTrue(repositorioDeAlunos.listaAlunosMatriculados().size() == 1);
    }
}
