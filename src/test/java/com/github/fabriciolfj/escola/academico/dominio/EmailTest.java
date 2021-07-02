package com.github.fabriciolfj.escola.academico.dominio;

import com.github.fabriciolfj.escola.academico.dominio.aluno.Email;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmailTest {

    @Test
    public void emailFormatoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new Email("fabrcio.com.br"));
    }

    @Test
    public void emailValid() {
        var email = new Email("Fabricio@Teste.com.br");
        assertTrue(email != null);
    }
}
