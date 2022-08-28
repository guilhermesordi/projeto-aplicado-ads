public class Main {
    public static void main(String[] args) {
        Candidato candidato = new Candidato();
        TipoPesquisa tipoPesquisa = new TipoPesquisa();
        FormatoPesquisa formatoPesquisa = new FormatoPesquisa();
        Pesquisa pesquisa = new Pesquisa();
        CandidatoPesquisa candidatoPesquisa = new CandidatoPesquisa();

        System.out.println("Candidato Id: " + candidato.getId());
        System.out.println("Tipo Pesquisa Id: " + tipoPesquisa.getId());
        System.out.println("Formato Pesquisa Id: " + formatoPesquisa.getId());
        System.out.println("Pesquisa Id: " + pesquisa.getId());
        System.out.println("Candidato Pesquisa Id: " + candidatoPesquisa.getId());
    }
}
