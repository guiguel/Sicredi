package com.sicredi.eleicao.domain.repository;

import com.sicredi.eleicao.domain.entity.Voto;
import com.sicredi.eleicao.domain.valueobject.TipoVoto;

import java.util.List;
import java.util.UUID;

public interface VotoRepository {

    Voto salvar(Voto voto);

    boolean existePorPautaEAssociado(UUID pautaId, Long associadoId);

    long contarPorPautaETipo(UUID pautaId, TipoVoto tipo);

    List<Voto> buscarPorPautaId(UUID pautaId);
}
