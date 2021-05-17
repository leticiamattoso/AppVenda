package com.vendas.dominio.clientes;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */

public class ClienteTeste {

    @Test
    public void deveOcorrerAExcecaoNoEnderecoCep()
    {
        
        Cliente product = Cliente.create("José", Documento.of("111.111.111-11", ""), Endereco.of("", "rua", 100, "Poços de Caldas", "MG"));
    }

    @Test
    public void deveOcorrerAExcecaoNoEnderecoCidade()
    {
        
        Cliente product = Cliente.create("José", Documento.of("111.111.111-11", ""), Endereco.of("125.987.9897", "rua", 100, "", "MG"));
    }

    @Test
    public void deveOcorrerAExcecaoNoEnderecoEstado()
    {
        
        Cliente product = Cliente.create("José", Documento.of("111.111.111-11", ""), Endereco.of("125.9872.697", "rua", 100, "Poços de Caldas", ""));
    }
    
}
