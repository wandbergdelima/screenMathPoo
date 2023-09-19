package org.example.entities;

public class Filme {

    //  Modelo da Entidade Filme
    public String nome;

    public int anoDeLancamento;

    public boolean incluidoNoPlano;

    public double somaDasAvaliacoes;

    public int totalDeAvaliacoes;

    public int duracaoEmMinutos;

    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

}
