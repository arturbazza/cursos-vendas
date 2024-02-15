package com.example.mercado.vendas.services;

import com.example.mercado.vendas.model.*;
import com.example.mercado.vendas.repository.ProdutoRepository;
import com.example.mercado.vendas.repository.VendaProdutoRepository;
import com.example.mercado.vendas.repository.VendaRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class VendaService {
    private  final VendaRepository vendaRepository;
    private  final ProdutoRepository produtoRepository;
    private final VendaProdutoRepository vendaProdutoRepository;

    @Transactional
    public void iniciarVenda(List<Long> idProdutos) {

        var venda = new Venda();
        venda.setDataVenda((LocalDateTime.now()) );
        venda.setEstadoVenda(EstadoVenda.ABERTO);
        venda.setValorTotal(BigDecimal.ZERO);
        venda.setTipoPagamento(null);
        //criar relação produtos com vendas

        venda = vendaRepository.save(venda);
        Venda finalVenda = venda;

        idProdutos.forEach(idProduto -> {
            Produto produto = produtoRepository.findById(idProduto).orElseThrow(() -> new IllegalArgumentException(
                    String.format("Produto %s não encontrado", idProduto)));
            VendaProduto vendaProduto = new VendaProduto();
            vendaProduto.setVenda(finalVenda);
            vendaProduto.setProduto(produto);
            VendaProdutoId vendaProdutoId = new VendaProdutoId(produto.getId(),finalVenda.getId());
            vendaProduto.setId(vendaProdutoId);
            vendaProduto.setQuantidade(1);
            vendaProduto.setDataEntrada(LocalDateTime.now());
            vendaProdutoRepository.save(vendaProduto);
        });
    }
}
