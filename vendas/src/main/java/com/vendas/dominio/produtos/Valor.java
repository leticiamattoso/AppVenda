package com.vendas.dominio.produtos;

/**
 * Um objeto da classe <code>Valor</code> que armazena o valor de venda do
 * produto a partir de uma coleção de objetos da classe <code>Business</code>
 * 
 * @author Letícia Mattoso (leticiahmattoso@hotmail.com)
 * @since 2021-05-17
 * @version 1.0
 * @see Busines
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

    public static Valor of(final double valor) {
        return new Valor(valor);
    }

    private void checkValorDeVendaDoProdutoLength(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("valores negativos ou iguais a zero não são permitidos.");
        }
    }

    private void aplicarAumento(double valor) {
        this.valorReajustado = ((valor * 30 / 100) + valor);
    }

    public double getValorProduto() {
        return this.valorReajustado;
    }
}