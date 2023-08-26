package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Filme {

    String titulo, genero, assistido, duracao;
    double ano, avaliacao;

    Scanner ler = new Scanner(System.in);

    public Filme(String titulo) {
        this.titulo = titulo;
    }

    public Filme(String titulo, String genero, String duracao, double ano) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
        this.ano = ano;
    }

    public void filmeAssistido (String titulo, String assistido){
        System.out.println("Filme " + this.titulo + " " + this.assistido);
    }

    public void avaliarFilme (double avaliacao){
        System.out.println("A nota do filme é: " + this.avaliacao);
    }

    public void menu(){
        System.out.println("Escolha alguma das opções ");
        System.out.println("1- Adicionar um novo filme ");
        System.out.println("2- Marcar um filme como assistido ");
        System.out.println("3- Avaliar um filme ");
        System.out.println("4- Mostrar a lista de filmes ");
        System.out.println("5- Sair. ");

        System.out.println("Agora digite a opção desejada: ");
        int op = ler.nextInt();

        switch (op){
            case 1:
                System.out.println("Qual o título do filme? ");
                titulo = ler.next();
                System.out.println("Qual o gênero do filme? ");
                genero = ler.next();
                System.out.println("Qual a duração do filme? ");
                duracao= ler.next();
                System.out.println("Qual o ano do filme? ");
                ano = ler.nextDouble();
                listaFilmes.add(new Filme(titulo, genero, duracao, ano));
                break;
            case 2:
                System.out.println("Qual filme você assistiu? ");
                titulo = ler.next();
                filmesAssistidos.add(new Filme(titulo));
                break;
            case 3:
                System.out.println("Qual filme gostaria de avaliar? ");
                titulo = ler.next();
                System.out.println("Qual a sua avaliação para esse filme? (De 1 a 5) ");
                avaliacao = ler.nextDouble();
                break;
            case 4:
                for(int i=0; i<listaFilmes.size(); i++){
                    System.out.println(listaFilmes.get(i));
                }
                break;
            case 5:
                System.out.println("bye bye");
                break;
            default:
                System.out.println("Ops! Opção inválida!");
        }

    }

    List listaFilmes = new ArrayList();
    List filmesAssistidos = new ArrayList<>();


}
