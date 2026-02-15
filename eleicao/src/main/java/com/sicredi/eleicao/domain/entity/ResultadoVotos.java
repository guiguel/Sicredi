package com.sicredi.eleicao.domain.entity;

public class ResultadoVotos {

    private final long votosSim;
    private final long votosNao;

    public ResultadoVotos(long votosSim, long votosNao) {
        this.votosSim = votosSim;
        this.votosNao = votosNao;
    }

    public boolean aprovado() {
        return votosSim > votosNao;
    }

    public long getVotosSim() {
        return votosSim;
    }

    public long getVotosNao() {
        return votosNao;
    }
}

