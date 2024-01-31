package com.example.mercado.vendas.controller.request;

import com.example.mercado.vendas.model.Endereco;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

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

}
