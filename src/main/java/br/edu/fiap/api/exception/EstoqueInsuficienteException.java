package br.edu.fiap.api.exception;

public class EstoqueInsuficienteException extends RuntimeException {
    public EstoqueInsuficienteException(Long id) {
        super("Estoque insuficiente para o consumo no estoque: " + id);
    }
}
