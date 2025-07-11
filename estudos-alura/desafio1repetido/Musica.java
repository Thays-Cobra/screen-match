package desafio1repetido;

public class Musica {
    private String titulo;
    private String artista;
    private int anoLancamento;
    private double avaliacao;
    private int numAvaliacoes;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + getTitulo());
        System.out.println("Nome do artista: " + getArtista());
        System.out.println("Ano de lançamento: " + getAnoLancamento());
    }

    public void avaliaMusica (double nota) {
        avaliacao += nota;
        numAvaliacoes++;
    }

    public double pegaMedia() {
        return avaliacao / numAvaliacoes;
    }
}
