package com.github.fabriciolfj.escola.dominio;

import com.github.fabriciolfj.escola.dominio.aluno.CPF;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CPFTest {

    @Test
    public void cpfInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new CPF("991222121"));
    }
}
