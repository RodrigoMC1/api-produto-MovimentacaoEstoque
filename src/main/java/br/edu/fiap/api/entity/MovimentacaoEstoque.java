package br.edu.fiap.api.entity;

import br.edu.fiap.api.controller.dto.AjusteEstoqueRequest;
import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "MovimentacaoEstoque")
public class MovimentacaoEstoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "estoque.id", nullable = false, unique = true)
    Estoque estoque;

    int quantidadeAnterior;

    public MovimentacaoEstoque(){}

    public MovimentacaoEstoque(Estoque estoque, int quantidadeAnterior, int quantidadeNova, String motivo) {
        this.estoque = estoque;
        this.quantidadeAnterior = quantidadeAnterior;
        this.quantidadeNova = quantidadeNova;
        this.motivo = motivo;
        this.criadoEm = Instant.now();
    }

    public Long getId() {
        return id;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public int getQuantidadeAnterior() {
        return quantidadeAnterior;
    }

    public int getQuantidadeNova() {
        return quantidadeNova;
    }

    public String getMotivo() {
        return motivo;
    }

    public Instant getCriadoEm() {
        return criadoEm;
    }

    int quantidadeNova;

    @Column(length = 200)
    String motivo;

    Instant criadoEm;



}
