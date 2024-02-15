package com.example.mercado.vendas.controller;

import com.example.mercado.vendas.controller.request.ProdutoId;
import com.example.mercado.vendas.controller.request.ProdutosIdRequest;
import com.example.mercado.vendas.services.VendaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v0/vendas")
@RequiredArgsConstructor
public class VendaController {

    private final VendaService vendaService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void  iniciarVenda(@RequestBody ProdutosIdRequest produtosIdRequest) {
        List<Long> idsProduto = produtosIdRequest.getProdutos()
                .stream()
                .map(ProdutoId::getIdProduto)
                .toList();
        vendaService.iniciarVenda(idsProduto);
    }

    @PostMapping("/{idVenda}/produtos")
    public void adicionarProdutosVenda(
            @PathVariable("idVenda") Long idVenda,
            @RequestBody ProdutosIdRequest produtosIdRequest) {

        System.out.println("Adicionar Produto!");
    }

    @DeleteMapping("/{idVenda}/produtos")
    public void removerProdutosVenda(
            @PathVariable("idVenda") Long idVenda,
            @RequestBody ProdutosIdRequest produtosIdRequest) {

        System.out.println("Remover Produto!");
    }

    @DeleteMapping("/{idVenda}/finalizar")
    public void finalizarVenda(
            @PathVariable("idVenda") Long idVenda) {

        System.out.println("Finalizar Venda!");
    }

}
