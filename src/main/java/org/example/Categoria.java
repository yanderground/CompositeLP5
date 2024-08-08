package org.example;

public class Categoria {

    private Conteudo conteudo;

    public void setConteudo(Conteudo conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        if (this.conteudo == null) {
            throw new NullPointerException("Categoria sem conteúdo");
        }
        return this.conteudo.getConteudo();
    }
}
