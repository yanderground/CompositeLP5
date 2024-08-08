package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CategoriaTest {

    @Test
    void deveRetornarConteudoCategoria() {
        SubCategoria subCategoria1 = new SubCategoria("Eletrodomésticos");

        SubCategoria subCategoria2 = new SubCategoria("Eletrônicos");
        Produto produto21 = new Produto("Smartphone", 1500.00);
        subCategoria2.addConteudo(produto21);

        SubCategoria subCategoria3 = new SubCategoria("Livros");
        Produto produto31 = new Produto("Livro de Programação", 80.00);
        Produto produto32 = new Produto("Livro de Design Patterns", 120.00);
        subCategoria3.addConteudo(produto31);
        subCategoria3.addConteudo(produto32);

        SubCategoria catalogo = new SubCategoria("Catálogo de Produtos");
        catalogo.addConteudo(subCategoria1);
        catalogo.addConteudo(subCategoria2);
        catalogo.addConteudo(subCategoria3);

        Categoria categoria = new Categoria();
        categoria.setConteudo(catalogo);

        assertEquals("SubCategoria: Catálogo de Produtos\n" +
                "SubCategoria: Eletrodomésticos\n" +
                "SubCategoria: Eletrônicos\n" +
                "Produto: Smartphone - preço: R$1500.0\n" +
                "SubCategoria: Livros\n" +
                "Produto: Livro de Programação - preço: R$80.0\n" +
                "Produto: Livro de Design Patterns - preço: R$120.0\n", categoria.getConteudo());
    }

    @Test
    void deveRetornarExecacaoCategoriaSemConteudo() {
        try {
            Categoria categoria = new Categoria();
            categoria.getConteudo();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Categoria sem conteúdo", e.getMessage());
        }
    }
}
