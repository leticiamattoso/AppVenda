package com.vendas.dominio.produtos;

/**
 * Um objeto da classe <code>Produto</code> armazena o modelo, serial, marca,
 * memória, processador e sistema operacional a partir de uma coleção de objetos
 * da classe <code>Business</code>
 * 
 * @author Letícia Mattoso (leticiahmattoso@hotmail.com)
 * @since 2021-05-17
 * @version 1.0
 * @see Busines
 */

public class Produto {
   
    private final String modelo; 
    private final String serial;
    private final String marca;
    private final String memoria;
    private final String processador;
    private final String sistemaOperacional;
    private final Quantidade quantidade;
    private final Valor valor;

    /**
     * Construtor da classe.
     * 
     * @param modelo                modelo do equipamento
     * @param serial                serial do equipamento
     * @param marca                 marca do equipamento
     * @param memoria               memória do equipamento
     * @param processador           processaor do equipamento
     * @param sistemaOperacional    sistema operacional do equipamento
     * @param quantidade            quantidade de equipamentos
     * @param valorDeCusto          valor de custo do equipamento
     * @param valorDeVenda          valor de venda do equipamento
     */

     private Produto(String modelo, String serial, String marca, String memoria, String processador, String sistemaOperacional, Quantidade quantidade, Valor valor) {
        this.modelo = modelo;
        this.serial = serial;
        this.marca = marca;
        this.memoria = memoria;
        this.processador = processador;
        this.sistemaOperacional = sistemaOperacional;
        this.quantidade = quantidade;
        this.valor = valor;
     }

     public static Produto create(String modelo, String serial, String marca, String memoria, String processador, String sistemaOperacional, Quantidade quantidade, Valor valor) {
        return new Produto(modelo, serial, marca, memoria, processador, sistemaOperacional, quantidade, valor);
     }

     public Quantidade getQuantidade() {
         return this.quantidade;
     }

     public double getValor() {
        return this.valor.getValorProduto();
     }
}