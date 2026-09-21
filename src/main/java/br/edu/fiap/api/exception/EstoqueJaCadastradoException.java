package br.edu.fiap.api.exception;

public class EstoqueJaCadastradoException extends RuntimeException {
      public EstoqueJaCadastradoException(Long produtoId) {
        super("Já existe estoque cadastado para o produto: " + produtoId);
    }
}
