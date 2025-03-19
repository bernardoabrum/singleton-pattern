package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SessaoAtualTest {

    @Test
    public void deveRetornarUsuario() {
        SessaoAtual.getInstance().iniciarSessao("Bernardo");
        assertEquals("Bernardo", SessaoAtual.getInstance().getNomeUsuario());
    }

    @Test
    public void deveRetornarSessaoAtiva() {
        SessaoAtual.getInstance().iniciarSessao("Bernardo");
        assertEquals(true, SessaoAtual.getInstance().getSessaoAtiva());
    }

    @Test
    public void deveEncerrarSessao() {
        SessaoAtual.getInstance().iniciarSessao("Bernardo");
        assertEquals(true, SessaoAtual.getInstance().getSessaoAtiva());
        SessaoAtual.getInstance().encerrarSessao();
        assertEquals(false, SessaoAtual.getInstance().getSessaoAtiva());
        assertNull(SessaoAtual.getInstance().getNomeUsuario());
    }
}