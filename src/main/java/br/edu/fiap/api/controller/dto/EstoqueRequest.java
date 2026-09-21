package br.edu.fiap.api.controller.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

public record EstoqueRequest(
        @Schema(description = "Identificador do produto", example = "1")
        @NotNull Long produtoId,
        @Schema(description = "Quantidade Inicial disponivel", example = "26")
        @PositiveOrZero int quantidade
) {
}
