package com.example.mercado.vendas.services;

import com.example.mercado.vendas.model.Cliente;
import com.example.mercado.vendas.model.Endereco;
import com.example.mercado.vendas.repository.ClienteReposirory;
import com.example.mercado.vendas.repository.EnderecoReository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteService {
    private final ClienteReposirory clienteReposirory;
    private final EnderecoReository enderecoReository;

    public List<Cliente> listarClientes() {
        return clienteReposirory.findAll();
    }

    public void criarNovoCliente(Cliente cliente) {
        Endereco endereco = cliente.getEndereco();
        enderecoReository.save(endereco);
        clienteReposirory.save(cliente);
    }

    public void editarCliente(Long id, Cliente cliente) {
        validarId(id);
    }

    private void validarId(Long id) {
        clienteReposirory.findById(id)
                .orElseThrow(() -> new RuntimeException(String.format("Cliente de id %s não existe", id)));
    }

    public void deletarCliente(Long id) {
        validarId(id);
        clienteReposirory.deleteById(id);
    }
}
