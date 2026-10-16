package modelos;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private int totalClassificacoes;
    private double classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getTotalClassificacoes() {
        return totalClassificacoes;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public void curte() {
        this.totalCurtidas++;

    }
    public void reproduz() {
        this.totalReproducoes++;
    }

}
