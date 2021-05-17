package com.vendas.dominio.produtos;

/**
 * Um objeto da classe <code>QuantidadeProduto</code> que armazena a quantidade do produto 
 * da classe <code>Business</code>
 * 
 * @author Letícia Mattoso (leticiahmattoso@hotmail.com)
 * @since 2021-05-17
 * @version 1.0
 * @see Busines
 */

 public class QuantidadeProduto {
    
    private final Integer quantidadeProduto;

     /**
     * Construtor da classe.
     * 
     * @param quantidadeProduto quantidade de produtos 
     */

    public QuantidadeProduto(Integer quantidadeProduto) {
        this.checkQuantidadeProdutoLength(quantidadeProduto);

        this.quantidadeProduto = quantidadeProduto;
    }

    public static QuantidadeProduto of(final Integer quantidadeProduto) {
        return new QuantidadeProduto(quantidadeProduto);
    }

    private void checkQuantidadeProdutoLength(Integer quantidadeProduto) {
        if (quantidadeProduto <= 0) {
            throw new IllegalArgumentException("valores negativos ou iguais a zero não são permitidos.");
        }
    }
    
 }