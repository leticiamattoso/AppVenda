package com.vendas.dominio.produtos;

/**
 * Um objeto da classe <code>SaleValue</code> que armazena o valor de venda do produto 
 * a partir de uma coleção de objetos da classe <code>Business</code>
 * 
 * @author Letícia Mattoso (leticiahmattoso@hotmail.com)
 * @since 2021-05-17
 * @version 1.0
 * @see Busines
 */

public class ValorDeVenda {
     
    private final double valorDeVenda;

    /**
     * Construtor da classe.
     * 
     * @param valorDeVenda valor de venda do produto 
     */

    public ValorDeVenda(double valorDeVenda) {
        this.checkValorDeVendaDoProdutoLength(valorDeVenda);

        this.valorDeVenda = valorDeVenda;
    }

    public static ValorDeVenda of(final double valorDeVenda) {
        return new ValorDeVenda(valorDeVenda);
    }

    private void checkValorDeVendaDoProdutoLength(double valorDeVenda) {
        if (valorDeVenda <= 0) {
            throw new IllegalArgumentException("valores negativos ou iguais a zero não são permitidos.");
        }
    }
}