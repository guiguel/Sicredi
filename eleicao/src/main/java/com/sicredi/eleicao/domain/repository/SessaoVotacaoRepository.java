package com.sicredi.eleicao.domain.repository;

import com.sicredi.eleicao.domain.entity.SessaoVotacao;

import java.util.Optional;
import java.util.UUID;

public interface SessaoVotacaoRepository {

    SessaoVotacao salvar(SessaoVotacao sessao);

    Optional<SessaoVotacao> buscarPorPautaId(UUID pautaId);

    boolean existeSessaoAberta(UUID pautaId);
}
