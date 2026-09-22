package br.edu.fiap.api.controller.dto;

import br.edu.fiap.api.entity.Estoque;
import br.edu.fiap.api.entity.MovimentacaoEstoque;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.Instant;

public record MovimentacaoEstoqueResponse(
        @Schema(example = "1") Long estoqueId,
        @Schema(example = "10") int quantidadeAnterior,
        @Schema(example = "7") int quantidadeNova,
        @Schema(example = "Ajuste de estoque após conferencia") String motivo,
        @Schema(example = "2026-09-21T17:30:00Z")Instant criadoEm
        ) {
    public static MovimentacaoEstoqueResponse de(MovimentacaoEstoque movimentacaoEstoque){
        return new MovimentacaoEstoqueResponse(
                movimentacaoEstoque.getEstoque().getId(),
                movimentacaoEstoque.getQuantidadeAnterior(),
                movimentacaoEstoque.getQuantidadeNova(),
                movimentacaoEstoque.getMotivo(),
                movimentacaoEstoque.getCriadoEm()
        );
    }
}
