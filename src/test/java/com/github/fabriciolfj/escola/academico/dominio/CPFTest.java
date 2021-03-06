package com.github.fabriciolfj.escola.academico.dominio;

import com.github.fabriciolfj.escola.shared.dominio.CPF;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CPFTest {

    @Test
    public void cpfInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new CPF("991222121"));
    }
}
