package br.edu.fiap.api.controller.dto;

import br.edu.fiap.api.entity.Estoque;
import io.swagger.v3.oas.annotations.media.Schema;

public record EstoqueResponse(
        @Schema(example = "1") Long id,
        @Schema(example = "1") Long produtoId,
        @Schema(example = "Teclado Mecanico") String produtoNome,
        @Schema(example = "10") int quantidade
) {

    public static EstoqueResponse de(Estoque estoque){
        return new EstoqueResponse(
                estoque.getId(),
                estoque.getProduto().getId(),
                estoque.getProduto().getNome(),
                estoque.getQuantidade()
        );
    }
}
