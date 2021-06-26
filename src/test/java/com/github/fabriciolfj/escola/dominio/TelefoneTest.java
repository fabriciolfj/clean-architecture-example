package com.github.fabriciolfj.escola.dominio;

import com.github.fabriciolfj.escola.dominio.aluno.Telefone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TelefoneTest {

    @Test
    public void telefoneDDDInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new Telefone("12", "988486222"));
    }

    @Test
    public void telefoneNumeroInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new Telefone("012", "88486222"));
    }

    @Test
    public void telefoneValido() {
        var telefone = new Telefone("012", "988486222");
        assertTrue(telefone != null);
    }
}
