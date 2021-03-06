package com.vendas.dominio.produtos;

/**
 * Um objeto da classe <code>Quantidade</code> que armazena a quantidade do produto 
 * da classe <code>Produto</code>
 * 
 * @author Letícia Mattoso (leticiahmattoso@hotmail.com)
 * @since 2021-05-17
 * @version 1.0
 * @see Produto
 */

 public class Quantidade {
    
    private final Integer quantidade;

     /**
     * Construtor da classe.
     * 
     * @param quantidade quantidade de produtos 
     */

    public Quantidade(Integer quantidade) {
        this.checkQuantidadeProdutoLength(quantidade);

        this.quantidade = quantidade;
    }
    /**
     * 
     * @param quantidade
     * @return
     */
    public static Quantidade of(final Integer quantidade) {
        return new Quantidade(quantidade);
    }
    /**
     * 
     * @param quantidade
     */
    private void checkQuantidadeProdutoLength(Integer quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("valores negativos ou iguais a zero não são permitidos.");
        }
    }
    
 }