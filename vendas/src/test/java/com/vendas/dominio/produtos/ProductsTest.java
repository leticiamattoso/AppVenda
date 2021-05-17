package com.vendas.dominio.produtos;

import static org.junit.Assert.assertTrue;

import com.vendas.dominio.produtos.QuantidadeProduto;
import com.vendas.dominio.produtos.ValorDeCusto;
import com.vendas.dominio.produtos.ValorDeVenda;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class ProductsTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void deveOcorrerAExcecaoQuantidadeNaoPodeSerMenorIgualAZero()
    {
        
        Produto product = Produto.create("", "", "", "", "", "", QuantidadeProduto.of(-11), ValorDeCusto.of(10), ValorDeVenda.of(10));
    }

    @Test
    public void deveOcorrerAExcecaoValorDeCustoNaoPodeSerMenorIgualAZero()
    {
        
        Produto product = Produto.create("", "", "", "", "", "", QuantidadeProduto.of(1), ValorDeCusto.of(-1), ValorDeVenda.of(10));
    }

    @Test
    public void deveOcorrerAExcecaoValorDeVendaNaoPodeSerMenorIgualAZero()
    {
        
        Produto product = Produto.create("", "", "", "", "", "", QuantidadeProduto.of(1), ValorDeCusto.of(10), ValorDeVenda.of(0));
    }
}
