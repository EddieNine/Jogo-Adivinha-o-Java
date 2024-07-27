package Heranca.series;

public class Serie {
    private String nome;
    private int temporadas;
    private int ano;

    public Serie(String nome, int temporadas, int ano) {
        this.nome = nome;
        this.temporadas = temporadas;
        this.ano = ano;
    }

    // Métodos especificos da classe
    public String pegarInformacoes() {
        String informacoes = String.format("Nome: %s (%d) - %d Temporada(s)", nome, ano, temporadas);
        return informacoes;
    }

    @Override
    public String toString() {
        String informacoes = String.format("Nome: %s (%d) - %d Temporada(s)", nome, ano, temporadas);
        return informacoes;
    }

    // Métodos get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
