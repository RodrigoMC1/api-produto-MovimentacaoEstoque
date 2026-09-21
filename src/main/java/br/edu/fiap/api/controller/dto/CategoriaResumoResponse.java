package br.edu.fiap.api.controller.dto;

import br.edu.fiap.api.entity.Categoria;
import io.swagger.v3.oas.annotations.media.Schema;


public record CategoriaResumoResponse(
        @Schema(example = "1") Long id,
        @Schema(example = "Perifericos") String nome,
        @Schema(example = "Acessorios para computadores") String descricao,
        @Schema(example = "3") long totalProdutos
) {

    public static CategoriaResumoResponse de(Categoria categoria, long totalProdutos) {
        return new CategoriaResumoResponse(
                categoria.getId(),
                categoria.getNome(),
                categoria.getDescricao(),
                totalProdutos
        );
    }
}
