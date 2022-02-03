package br.com.letscode.ed.listas.fila;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

import br.com.letscode.dominio.Pessoa;

public class TesteFila {
    public static void main(String[] args) {

        // FIFO - PEPS
        // PRIMEIRO A ENTRAR, PRIMEIRO A SAIR

//        Queue<Pessoa> fila = new LinkedList<>();

        Deque<Pessoa> fila = new LinkedList<>();



        Pessoa jorge = new Pessoa("Jorge");
        Pessoa maria = new Pessoa("Maria");
        Pessoa joao = new Pessoa("Joao");

//        FilaDePessoas fila = new FilaDePessoas();

        fila.offer(jorge);
        fila.offer(maria);

        System.out.println(fila);

        Pessoa r1 = fila.poll();

        System.out.println("Removido: " + r1);

        System.out.println(fila);

        fila.offer(joao);

        System.out.println(fila.peek());

        System.out.println(fila);

        for (Pessoa pessoa : fila) {
            System.out.println(fila.pop());
        }


    }
}
