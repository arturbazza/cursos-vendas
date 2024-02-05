package com.example.mercado.vendas.services;
import com.example.mercado.vendas.repository.EnderecoReository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EnderecoService {
    private final EnderecoReository enderecoRepository;
}
