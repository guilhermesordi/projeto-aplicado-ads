package model;

/**
 * CandidatoPesquisa
 */

public class CandidatoPesquisa {

    int id;
    int idCandidato;
    int idPesquisa;
    int votos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }

    public int getIdPesquisa() {
        return idPesquisa;
    }

    public void setIdPesquisa(int idPesquisa) {
        this.idPesquisa = idPesquisa;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }
    
}