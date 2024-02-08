package com.example.mercado.vendas.controller;

import com.example.mercado.vendas.controller.request.ProdutosIdRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v0/vendas")
public class VendasController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void  iniciarVenda(@RequestBody ProdutosIdRequest produtosIdRequest) {

        System.out.println("Iniciar Venda!");
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
