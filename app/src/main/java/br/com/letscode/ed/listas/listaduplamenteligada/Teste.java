package br.com.letscode.ed.listas.listaduplamenteligada;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import br.com.letscode.dominio.Pessoa;

public class Teste {
    public static void main(String[] args) {


        LinkedList<Pessoa> lista = new LinkedList<>();

        lista.add(new Pessoa("Jorge"));

        lista.add(new Pessoa("Maria"));

        lista.add(new Pessoa("Jaqueline"));

        lista.add(new Pessoa("Jorge"));

        System.out.println(lista);

        System.out.println("divisao: " + 47 % 25);

        HashSet<Pessoa> set = new HashSet<>();
        set.add(new Pessoa("Jorge"));
        set.add(new Pessoa("Joao"));

    }
}
