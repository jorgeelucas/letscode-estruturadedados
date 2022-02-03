package br.com.letscode.ed.listas.conjunto;

import java.util.HashSet;
import java.util.Set;

import br.com.letscode.dominio.Pessoa;

public class TesteConjunto {

    public static void main(String[] args) {

        Set<Pessoa> conjunto = new HashSet<>();

        Pessoa jorge = new Pessoa("Jorge");
        Pessoa maria = new Pessoa("Maria");
        Pessoa joao = new Pessoa("Joao");

        conjunto.add(jorge);
        conjunto.add(maria);
        conjunto.add(joao);

        conjunto.add(jorge);

        System.out.println(conjunto);

        conjunto.remove(jorge);
        System.out.println(conjunto);

    }
}
