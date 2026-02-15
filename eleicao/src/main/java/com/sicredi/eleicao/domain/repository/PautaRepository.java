package com.sicredi.eleicao.domain.repository;

import com.sicredi.eleicao.domain.entity.Pauta;

import java.util.Optional;
import java.util.UUID;

public interface PautaRepository {

    Pauta salvar(Pauta pauta);

    Optional<Pauta> buscarPorId(UUID id);

    boolean existePorId(UUID id);
}
