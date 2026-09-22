package br.edu.fiap.api.repository;

import br.edu.fiap.api.entity.Estoque;
import br.edu.fiap.api.entity.Produto;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EstoqueRepository extends JpaRepository<Estoque, Long> {

    @Override
    @EntityGraph(attributePaths = "produto")
    Optional<Estoque> findById(Long id);

    @EntityGraph(attributePaths = "produto")
    Optional<Estoque> findByProduto_Id(Long produtoId);
}