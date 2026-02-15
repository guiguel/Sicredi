package com.sicredi.eleicao.domain.entity;

import java.time.LocalDateTime;
import java.util.UUID;

public class SessaoVotacao {

    private final UUID id;
    private final UUID pautaId;
    private final LocalDateTime inicio;
    private final LocalDateTime fim;

    public SessaoVotacao(UUID id, UUID pautaId, LocalDateTime inicio, LocalDateTime fim) {
        if (fim.isBefore(inicio)) {
            throw new IllegalArgumentException("Data de fim não pode ser antes do início");
        }

        this.id = id;
        this.pautaId = pautaId;
        this.inicio = inicio;
        this.fim = fim;
    }

    public boolean estaAberta() {
        LocalDateTime agora = LocalDateTime.now();
        return agora.isAfter(inicio) && agora.isBefore(fim);
    }

    public UUID getId() {
        return id;
    }

    public UUID getPautaId() {
        return pautaId;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public LocalDateTime getFim() {
        return fim;
    }
}

