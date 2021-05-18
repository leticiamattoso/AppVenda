package com.vendas.dominio.clientes;

/**
 * Um objeto da classe <code>Endereco</code> que armazena o endereço do cliente
 * a partir de uma coleção de objetos da classe <code>Cliente</code>
 * 
 * @author Letícia Mattoso (leticiahmattoso@hotmail.com)
 * @since 2021-05-17
 * @version 1.0
 * @see Cliente
 */

public class Endereco {

    private final String cep;
    private final String rua;
    private final Integer numero;
    private final String Cidade;
    private final String Estado;

    /**
     * Construtor da classe.
     * 
     * @param cep    cep do endereço do cliente
     * @param rua    rua do endereço do cliente
     * @param numero numero do endereço do cliente
     * @param cidade cidade do endereço do cliente
     * @param estado estado do endereço do cliente
     */

    public Endereco(String cep, String rua, Integer numero, String cidade, String estado) {
        this.checkDadosEndereco(cep, cidade, estado);
        
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.Cidade = cidade;
        this.Estado = estado;
    }
    /**
     * 
     * @param cep
     * @param rua
     * @param numero
     * @param cidade
     * @param estado
     * @return Endereco
     */
    public static Endereco of(final String cep, final String rua, final Integer numero, final String cidade,
            final String estado) {
        return new Endereco(cep, rua, numero, cidade, estado);
    }
    /**
     * 
     * @param cep
     * @param cidade
     * @param estado
     */
    private void checkDadosEndereco(String cep, String cidade, String estado) {
        if (cep == "") {
            throw new IllegalArgumentException("cep é obrigatório.");
        }

        if (cidade == "") {
            throw new IllegalArgumentException("cidade é obrigatório.");
        }

        if (estado == "") {
            throw new IllegalArgumentException("estado é obrigatório.");
        }
    }
}
