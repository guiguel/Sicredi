package com.sicredi.eleicao.domain.entity;

import java.time.LocalDateTime;
import java.util.UUID;
import com.sicredi.eleicao.domain.enum;

public class Voto {

    private final UUID id;
    private final UUID pautaId;
    private final Long associadoId;
    private final TipoVoto tipo;
    private final LocalDateTime votadoEm;

    public Voto(UUID id,
                UUID pautaId,
                Long associadoId,
                TipoVoto tipo,
                LocalDateTime votadoEm) {

        if (associadoId == null) {
            throw new IllegalArgumentException("Associado é obrigatório");
        }

        if (tipo == null) {
            throw new IllegalArgumentException("Tipo do voto é obrigatório");
        }

        this.id = id;
        this.pautaId = pautaId;
        this.associadoId = associadoId;
        this.tipo = tipo;
        this.votadoEm = votadoEm;
    }

    public UUID getId() {
        return id;
    }

    public UUID getPautaId() {
        return pautaId;
    }

    public Long getAssociadoId() {
        return associadoId;
    }

    public TipoVoto getTipo() {
        return tipo;
    }

    public LocalDateTime getVotadoEm() {
        return votadoEm;
    }
}