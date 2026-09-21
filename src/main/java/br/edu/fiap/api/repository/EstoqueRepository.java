package br.edu.fiap.api.repository;

import br.edu.fiap.api.entity.Estoque;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EstoqueRepository extends JpaRepository<Estoque, Long> {

    @EntityGraph(attributePaths = "produto")
    Optional<Estoque> findByProduto_Id(Long produtoId);
}