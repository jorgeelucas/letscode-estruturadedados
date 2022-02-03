package br.com.letscode.aulacollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

public class AulaCollections {
    public static void main(String[] args) {

        List<Pessoa> lista = new ArrayList<>();
        lista.add(new Pessoa("jorge", 25, 1.70, new Carro("onix")));
        lista.add(new Pessoa("maria", 26, 1.75, new Carro("gol")));
        lista.add(new Pessoa("joao", 28, 1.80, new Carro("polo")));
        lista.add(new Pessoa("joao", 27, 1.75, new Carro("fusca")));
        lista.add(new Pessoa("joao", 27, 1.76, new Carro("brasilia")));

        System.out.println("Lista sem ordenacao");
        System.out.println(lista);

        System.out.println("lista ordenada");
//        Collections.sort(lista, Comparator
//            .comparing(pessoa -> pessoa.getCarro().getNome()));
//            .thenComparing(Pessoa::getIdade)
//            .thenComparing(Pessoa::getTamanho)
//            .thenComparing(pessoa -> pessoa.getCarro().getNome()));

        lista.sort(Comparator
            .comparing(pessoa -> pessoa.getNome()));


        System.out.println(lista);
    }
}

@Data
@AllArgsConstructor
class Pessoa {
    private String nome;
    private Integer idade;
    private Double tamanho;
    private Carro carro;
}

@Data
@AllArgsConstructor
class Carro {
    private String nome;
}