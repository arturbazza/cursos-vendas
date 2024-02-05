package com.example.mercado.vendas.repository;

import com.example.mercado.vendas.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoReository extends JpaRepository<Endereco, Long> {
}
