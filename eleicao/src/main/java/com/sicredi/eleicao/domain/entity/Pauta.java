package com.sicredi.eleicao.domain.entity;

import java.time.LocalDateTime;
import java.util.UUID;

public class Pauta {

    private final UUID id;
    private final String titulo;
    private final String descricao;
    private final LocalDateTime criadaEm;

    public Pauta(UUID id, String titulo, String descricao, LocalDateTime criadaEm) {
        if (titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException("Título da pauta é obrigatório");
        }

        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.criadaEm = criadaEm;
    }

    public UUID getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDateTime getCriadaEm() {
        return criadaEm;
    }
}

