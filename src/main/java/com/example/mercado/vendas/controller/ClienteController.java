package com.example.mercado.vendas.controller;

import com.example.mercado.vendas.controller.request.ClienteRequest;
import com.example.mercado.vendas.controller.response.ClienteResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v0/clientes")
public class ClienteController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criarCliente(@RequestBody ClienteRequest clienteRequest) {
        System.out.println(clienteRequest);
    }
    @GetMapping
    public List<ClienteResponse> listarClientes() {
        return new ArrayList<>();
    }

    @DeleteMapping(path = "/{id}")
    public void deletarCliente(@PathVariable Long id) {

    }

    @PutMapping(path = "/{id}")
    public void editarCliente(@PathVariable Long id, @RequestBody ClienteRequest clienteRequest) {
        System.out.println("Editando: ");
        System.out.println(clienteRequest);
    }
}
