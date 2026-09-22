package br.edu.fiap.api.repository;

import br.edu.fiap.api.entity.MovimentacaoEstoque;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovimentacaoEstoqueRepository extends JpaRepository<MovimentacaoEstoque, Long> {

    List<MovimentacaoEstoque> findByEstoqueId(Long estoqueId);
}
