package model;

/**
 * Candidato
 */

public class Candidato {
    
    int id;
    String nome;
    String partido;
    boolean fichaLimpa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public boolean getFichaLimpa() {
        return fichaLimpa;
    }

    public void setFichaLimpa(boolean fichaLimpa) {
        this.fichaLimpa = fichaLimpa;
    }
}