package com.vendas.dominio.produtos;

/**
 * Um objeto da classe <code>Valor</code> que armazena o valor de venda do
 * produto a partir de uma coleção de objetos da classe <code>Produto</code>
 * 
 * @author Letícia Mattoso (leticiahmattoso@hotmail.com)
 * @since 2021-05-17
 * @version 1.0
 * @see Produto
 */

public class Valor {

    private final double valor;
    private double valorReajustado;

    /**
     * Construtor da classe.
     * 
     * @param valor valor de venda do produto
     */

    public Valor(double valor) {
        this.checkValorDeVendaDoProdutoLength(valor);
        this.aplicarAumento(valor);

        this.valor = valor;
    }
    /**
     * 
     * @param valor
     * @return valor
     */
    public static Valor of(final double valor) {
        return new Valor(valor);
    }
    /**
     * 
     * @param valor
     */
    private void checkValorDeVendaDoProdutoLength(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("valores negativos ou iguais a zero não são permitidos.");
        }
    }
    /**
     * 
     * @param valor
     */
    private void aplicarAumento(double valor) {
        this.valorReajustado = ((valor * 30 / 100) + valor);
    }
    /**
     * 
     * @return valor
     */
    public double getValorProduto() {
        return this.valorReajustado;
    }
}