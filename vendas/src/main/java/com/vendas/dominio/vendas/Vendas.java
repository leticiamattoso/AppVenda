package com.vendas.dominio.vendas;

import org.joda.time.LocalDate;

import java.util.List;

import com.vendas.dominio.clientes.Cliente;
import com.vendas.dominio.produtos.Produto;

/**
 * Um objeto da classe <code>Vendas</code> que armazena os dados do cliente a
 * partir de uma coleção de objetos da classe <code>Business</code>
 * 
 * @author Letícia Mattoso (leticiahmattoso@hotmail.com)
 * @since 2021-05-17
 * @version 1.0
 */

public class Vendas {

    private final Cliente cliente;
    private final List<Produto> produtos;
    private final LocalDate data;
    private double valor;

    /**
     * Construtor da classe.
     * 
     * @param cliente cliente
     * @param produtos produto
     */

    public Vendas(Cliente cliente, List<Produto> produtos) {
        this.checkDadosDeEntrada(cliente, produtos);
        this.aplicarValorTotal(produtos);

        this.cliente = cliente;
        this.produtos = produtos;
        this.data = LocalDate.now();
    }
    /**
     * 
     * @param cliente
     * @param produtos
     */
    private void checkDadosDeEntrada(Cliente cliente, List<Produto> produtos) {
        if (cliente == null) {
            throw new IllegalArgumentException("cliente não informado.");
        }

        if (produtos.size() < 1) {
            throw new IllegalArgumentException("produtos do pedido incorreto.");
        }
    }
    /**
     * 
     * @param produtos
     */
    private void aplicarValorTotal(List<Produto> produtos) {
        this.valor = 0;

        for (Produto produto : produtos) {
            this.valor += produto.getValor();
        }
    }
    /**
     * 
     * @return valor
     */
    public double getValor() {
        return this.valor;
    }
}
