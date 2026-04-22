package com.sistema;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {

    @Test
    public void testSetAndGetNome() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João");
        assertEquals("João", pessoa.getNome());
    }

    @Test
    public void testSetAndGetSobrenome() {
        Pessoa pessoa = new Pessoa();
        pessoa.setSobrenome("Silva");
        assertEquals("Silva", pessoa.getSobrenome());
    }

    @Test
    public void testSetNomeVazioDeveLancarExcecao() {
        Pessoa pessoa = new Pessoa();
        assertThrows(IllegalArgumentException.class, () -> {
            pessoa.setNome("");
        });
    }

    @Test
    public void testSetNomeNullDeveLancarExcecao() {
        Pessoa pessoa = new Pessoa();
        assertThrows(IllegalArgumentException.class, () -> {
            pessoa.setNome(null);
        });
    }

    @Test
    public void testSetSobrenomeVazioDeveLancarExcecao() {
        Pessoa pessoa = new Pessoa();
        assertThrows(IllegalArgumentException.class, () -> {
            pessoa.setSobrenome("");
        });
    }

    @Test
    public void testSetSobrenomeNullDeveLancarExcecao() {
        Pessoa pessoa = new Pessoa();
        assertThrows(IllegalArgumentException.class, () -> {
            pessoa.setSobrenome(null);
        });
    }
}
