package com.example.mercado.vendas.controller.request;

import com.example.mercado.vendas.model.Cliente;
import com.example.mercado.vendas.model.Endereco;
import lombok.Data;

/**
 * {
 *       "nome": "Artur",
 *        "identidade": "8069308719",
 *       "cpf": "90329970097",
 *       "endereco": {
 *          "logradouro": "Rua",
 *          "bairro": "Bairro"
 *       }
 * }
*/
@Data
public class ClienteRequest {
    private String nome;
    private String identidade;
    private String cpf;
    private EnderecoRequest endereco;
    public Cliente toModel() {
        var cliente = new Cliente();
        cliente.setNome(this.nome);
        cliente.setIdentidade(this.identidade);
        cliente.setCpf(this.cpf);
        cliente.setEndereco(this.endereco.toModel());
        return cliente;

    }

}
