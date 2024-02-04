package com.example.mercado.vendas.repository;

import com.example.mercado.vendas.model.Cliente;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;
@Data
public class ClienteRepository extends JpaRepository<Cliente, Long> {
}
