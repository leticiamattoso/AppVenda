package com.vendas.dominio.clientes;

/**
 * Um objeto da classe <code>Documento</code> que armazena o cpf ou cnpj 
 * a partir de uma coleção de objetos da classe <code>Cliente</code>
 * 
 * @author Letícia Mattoso (leticiahmattoso@hotmail.com)
 * @since 2021-05-17
 * @version 1.0
 * @see Cliente
 */

public class Documento {

    private final String cpf;
    private final String cnpj;

    /**
     * Construtor da classe.
     * 
     * @param cpf  cpf do cliente 
     * @param cnpj cnpj do cliente 
     */

    public Documento(String cpf, String cnpj) {
        this.checkDocumento(cpf, cnpj);
        
        this.cpf = cpf;
        this.cnpj = cnpj;
    }
    /**
     * 
     * @param cpf
     * @param cnpj
     * @return
     */
    public static Documento of(final String cpf, final String cnpj) {
        return new Documento(cpf, cnpj);
    }
    /**
     * 
     * @param cpf
     * @param cnpj
     */
    private void checkDocumento(String cpf, String cnpj) {
        if (cpf == "" && cnpj == "") {
            throw new IllegalArgumentException("informe ao menos um dos documentos CPF/CNPJ.");
        }
    }
}
