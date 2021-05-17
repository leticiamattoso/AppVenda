package com.vendas.dominio.produtos;

/**
 * Um objeto da classe <code>ValorDeCusto</code> que armazena o valor de custo do produto 
 * a partir de uma coleção de objetos da classe <code>Business</code>
 * 
 * @author Letícia Mattoso (leticiahmattoso@hotmail.com)
 * @since 2021-05-17
 * @version 1.0
 * @see Busines
 */

public class ValorDeCusto {
     
    private final double valorDeCusto;

    /**
     * Construtor da classe.
     * 
     * @param valorDeCusto valor de custo do produto 
     */

    public ValorDeCusto(double valorDeCusto) {
        this.checkValorDeCustoDoProdutoLength(valorDeCusto);

        this.valorDeCusto = valorDeCusto;
    }

    public static ValorDeCusto of(final double valorDeCusto) {
        return new ValorDeCusto(valorDeCusto);
    }

    private void checkValorDeCustoDoProdutoLength(double valorDeCusto) {
        if (valorDeCusto <= 0) {
            throw new IllegalArgumentException("valores negativos ou iguais a zero não são permitidos.");
        }
    }
}