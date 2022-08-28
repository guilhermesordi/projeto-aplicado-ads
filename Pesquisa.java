import java.util.Date;

/**
 * Pesquisa
 */

public class Pesquisa {

    int id;
    String instituicao;
    Date dataPesquisa;
    String localPesquisa;
    double mediaIdade;
    int idTipoPesquisa;
    int idFormatoPesquisa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public Date getDataPesquisa() {
        return dataPesquisa;
    }

    public void setDataPesquisa(Date dataPesquisa) {
        this.dataPesquisa = dataPesquisa;
    }

    public String getLocalPesquisa() {
        return localPesquisa;
    }

    public void setLocalPesquisa(String localPesquisa) {
        this.localPesquisa = localPesquisa;
    }

    public double getMediaIdade() {
        return mediaIdade;
    }

    public void setMediaIdade(double mediaIdade) {
        this.mediaIdade = mediaIdade;
    }

    public int getIdTipoPesquisa() {
        return idTipoPesquisa;
    }

    public void setIdTipoPesquisa(int idTipoPesquisa) {
        this.idTipoPesquisa = idTipoPesquisa;
    }

    public int getIdFormatoPesquisa() {
        return idFormatoPesquisa;
    }

    public void setIdFormatoPesquisa(int idFormatoPesquisa) {
        this.idFormatoPesquisa = idFormatoPesquisa;
    }
    
}