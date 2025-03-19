package org.example;

public class SessaoAtual {

    private SessaoAtual() {};
    private static SessaoAtual instance = new SessaoAtual();
    public static SessaoAtual getInstance() {
        return instance;
    }

    private String nomeUsuario;
    private boolean sessaoAtiva = false;

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public Boolean getSessaoAtiva() {
        return sessaoAtiva;
    }

    public void iniciarSessao(String nomeUsuario) {
        if (!sessaoAtiva) {
            this.nomeUsuario = nomeUsuario;
            this.sessaoAtiva = true;
            System.out.println("Logado como: " + nomeUsuario);
        } else {
            System.out.println("Já está logado!");
        }
    }

    public void encerrarSessao() {
        if (sessaoAtiva) {
            this.nomeUsuario = null;
            this.sessaoAtiva = false;
            System.out.println("Sessão encerrada");
        } else {
            System.out.println("Não existe sessão ativa!");
        }
    }
}
