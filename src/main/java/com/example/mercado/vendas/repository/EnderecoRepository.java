package com.example.mercado.vendas.repository;

import com.example.mercado.vendas.model.Endereco;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;

@Data
public class EnderecoRepository extends JpaRepository<Endereco, Long> {
}
