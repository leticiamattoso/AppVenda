package com.vendas.dominio.produtos;

import static org.junit.Assert.assertTrue;

import com.vendas.dominio.produtos.Quantidade;
import com.vendas.dominio.produtos.Valor;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class ProdutoTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void deveOcorrerAExcecaoQuantidadeNaoPodeSerMenorIgualAZero()
    {
        
        Produto product = Produto.create("", "", "", "", "", "", Quantidade.of(-11), Valor.of(10));
    }

    @Test
    public void deveOcorrerAExcecaoValorDeCustoNaoPodeSerMenorIgualAZero()
    {
        
        Produto product = Produto.create("", "", "", "", "", "", Quantidade.of(1), Valor.of(10));
    }

    @Test
    public void deveOcorrerAExcecaoValorDeVendaNaoPodeSerMenorIgualAZero()
    {
        
        Produto product = Produto.create("", "", "", "", "", "", Quantidade.of(1), Valor.of(0));
    }
}
