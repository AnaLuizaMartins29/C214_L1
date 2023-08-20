package org.example;

import org.example.Filme;

public class Main {
    public static void main(String[] args) {

        Filme f1 = new Filme("Até que a Sorte nos Separe", "comedia","Assistido","1h 44m",2012,4.9);
        Filme f2 = new Filme("Minha Culpa", "romance","Não assistido","1h 57m",2023,0);
        Filme f3 = new Filme("Velozes e Furiosos 10", "Ação","Assistido","2h 21m",2023,5);

        f1.filmeAssistido(f1.titulo, f1.assistido);
        f2.filmeAssistido(f2.titulo, f2.assistido);
        f3.filmeAssistido(f3.titulo, f3.assistido);

        System.out.println("------------------");

        f1.avaliarFilme(f1.avaliacao);
        f2.avaliarFilme(f2.avaliacao);
        f3.avaliarFilme(f3.avaliacao);

    }
}