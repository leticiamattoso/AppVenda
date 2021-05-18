package com.vendas.dominio.clientes;

/**
 * Um objeto da classe <code>Cliente</code> que armazena os dados do cliente a
 * partir de uma coleção de objetos da classe <code>Cliente</code>
 * 
 * @author Letícia Mattoso (leticiahmattoso@hotmail.com)
 * @since 2021-05-17
 * @version 1.0
 * @see Cliente
 */

public class Cliente {

    private final String nome;
    private final Documento documento;
    private final Endereco endereco;

    /**
     * Construtor da classe.
     * 
     * @param nome      nome do cliente
     * @param documento documento do cliente
     * @param endereco  endereço do cliente
     */

    private Cliente(String nome, Documento documento, Endereco endereco) {
        this.nome = nome;
        this.documento = documento;
        this.endereco = endereco;
    }
    /**
     * 
     * @param nome
     * @param documento
     * @param endereco
     * @return
     */
    public static Cliente create(String nome, Documento documento, Endereco endereco) {
        return new Cliente(nome, documento, endereco);
    }
    /**
     * 
     * @return nome
     */
    public String getNome() {
        return this.nome;
    }
    /**
     * 
     * @return documento
     */
    public Documento getDocumento() {
        return this.documento;
    }
    /**
     * 
     * @return Endereço
     */
    public Endereco getEndereco() {
        return this.endereco;
    }
}
