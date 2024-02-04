package com.example.mercado.vendas.services;

import com.example.mercado.vendas.repository.ClienteRepository;
import com.example.mercado.vendas.model.Cliente;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteService {
    private final ClienteRepository clienteRepository;

    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    public void criarNovoCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    public void editarCliente(Long id, Cliente cliente) {
        validarId(id);
    }

    private void validarId(Long id) {
        clienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(String.format("Cliente de id %s não existe", id)));
    }

    public void deletarCliente(Long id) {
        validarId(id);
        clienteRepository.deleteById(id);
    }
}
