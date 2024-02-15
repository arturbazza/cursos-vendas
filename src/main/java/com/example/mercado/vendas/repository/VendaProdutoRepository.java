package com.example.mercado.vendas.repository;

import com.example.mercado.vendas.model.Venda;
import com.example.mercado.vendas.model.VendaProduto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendaProdutoRepository extends JpaRepository<VendaProduto, Long> {

}
