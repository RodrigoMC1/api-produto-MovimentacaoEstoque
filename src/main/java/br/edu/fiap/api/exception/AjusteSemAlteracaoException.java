package br.edu.fiap.api.exception;

public class AjusteSemAlteracaoException extends RuntimeException {
    public AjusteSemAlteracaoException(Long id) {
        super("Alteração do estoque pelo mesma quantidade do estoque: "+id);
    }
}
