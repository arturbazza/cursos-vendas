package com.example.mercado.vendas.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "venda")
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dataVenda;

    @Column(name = "valor_total")
    private BigDecimal valorTotal;

    private TipoPagamento tipoPagamento;

    @Enumerated(EnumType.STRING)
    private EstadoVenda estadoVenda;

}
