package br.com.letscode.ed.listas.conjunto;

import br.com.letscode.dominio.Pessoa;

public class TesteConjunto {

    public static void main(String[] args) {

        ConjuntoDePessoas conjunto = new ConjuntoDePessoas();
        Pessoa jorge = new Pessoa("Jorge");
        Pessoa maria = new Pessoa("Maria");
        Pessoa joao = new Pessoa("Joao");


        conjunto.adicionar(jorge);
        conjunto.adicionar(maria);
        conjunto.adicionar(joao);
//        conjunto.listarTodos();

        conjunto.adicionar(jorge);

        conjunto.listarTodos();

    }
}
