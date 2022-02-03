package br.com.letscode.ed.listas.pilha;

import java.util.Stack;

import br.com.letscode.dominio.Pessoa;

public class TestePilha {
    public static void main(String[] args) {

        // LIFO - UEPS

        Stack<Pessoa> pilha = new Stack<>();

        Pessoa jorge = new Pessoa("Jorge");
        Pessoa maria = new Pessoa("Maria");
        Pessoa joao = new Pessoa("Joao");

//        PilhaDePessoas pilha = new PilhaDePessoas();
        pilha.push(jorge);
        pilha.push(maria);

        System.out.println(pilha);

        Pessoa r1 = pilha.pop();
        System.out.println("Removido: " + r1);

        System.out.println(pilha);

        pilha.push(joao);

        System.out.println(pilha);

        System.out.println(pilha.peek());

        System.out.println(pilha);

        System.out.println(pilha.empty());

        pilha.pop();
        pilha.pop();

        System.out.println(pilha.empty());

    }
}
