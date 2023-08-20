package org.example;
public class Filme {

    String titulo, genero, assistido, duracao;
    double ano, avaliacao;

    public Filme(String titulo, String genero, String assistido, String duracao, double ano, double avaliacao) {
        this.titulo = titulo;
        this.genero = genero;
        this.assistido = assistido;
        this.duracao = duracao;
        this.ano = ano;
        this.avaliacao = avaliacao;
    }

    public void filmeAssistido (String titulo, String assistido){
        System.out.println("Filme " + this.titulo + " " + this.assistido);
    }

    public void avaliarFilme (double avaliacao){
        System.out.println("A nota do filme é: " + this.avaliacao);
    }

}
