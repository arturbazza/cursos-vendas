package com.example.mercado.vendas.controller.response;

import com.example.mercado.vendas.controller.request.EnderecoRequest;
import lombok.Data;

@Data
public class ClienteResponse {

    private Long id;
    private String nome;
    private String identidade;
    private String cpf;

    private EnderecoResponse endereco;

    public static ClienteResponse fromModel(Cliente cliente) {
        var ClienteResponse
    }

}
