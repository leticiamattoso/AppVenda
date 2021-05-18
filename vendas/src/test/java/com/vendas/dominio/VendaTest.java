package com.vendas.dominio.vendas;

import java.util.Arrays;
import java.util.List;

import com.vendas.dominio.clientes.Cliente;
import com.vendas.dominio.clientes.Documento;
import com.vendas.dominio.clientes.Endereco;
import com.vendas.dominio.produtos.Produto;
import com.vendas.dominio.produtos.QuantidadeProduto;
import com.vendas.dominio.produtos.Valor;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */

public class VendaTest {

    private Cliente cliente;
    private Produto produto1;
    private Produto produto2;
    private Produto produto3;
    private Produto produto4;
    private Produto produto5;

    @Before
    public void init() {
        cliente = Cliente.create("José da Silva", Documento.of("111.111.111-11", ""), Endereco.of("37701-000", "Rua dos monstros", 152, "Poços de Caldas", "MG"));
        produto1 = Produto.create("PC gamer 1", "HGDR2547", "DELL", "8G", "i7", "Windows", Quantidade.of(10), Valor.of(3500));
        produto2 = Produto.create("PC gamer 2", "HGDR2547", "DELL", "12G", "i7", "Windows", Quantidade.of(10), Valor.of(8000));
        produto3 = Produto.create("PC gamer 3", "HGDR2547", "Lenovo", "12G", "i7", "Windows", Quantidade.of(10), Valor.of(7000));
        produto4 = Produto.create("PC gamer 4", "HGDR2547", "DELL", "4G", "i7", "Windows", Quantidade.of(10), Valor.of(4000));
        produto5 = Produto.create("PC gamer 5", "HGDR2547", "Acer", "8G", "i7", "Windows", Quantidade.of(10), Valor.of(4000));
    }

    /**
     * Rigorous Test :-)
     */

    @Test
    public void operacaoDevenda() {

        List<Produto> produtos = Arrays.asList(produto1, produto2, produto3, produto4, produto5);

        Vendas venda = new Vendas(cliente, produtos);
    }

    @Test
    public void deveOcorrerAExcecaoClienteNaoInformado() {

        List<Produto> produtos = Arrays.asList(produto1, produto2, produto3, produto4, produto5);

        Vendas venda = new Vendas(null, produtos);
    }
}
