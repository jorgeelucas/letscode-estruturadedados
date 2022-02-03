package br.com.letscode.ed.listas.conjunto;

import java.util.ArrayList;
import java.util.LinkedList;

import br.com.letscode.dominio.Pessoa;
import br.com.letscode.ed.listas.EstruturaDadosConjunto;

public class ConjuntoDePessoas implements EstruturaDadosConjunto {

    private ArrayList<LinkedList<Pessoa>> espalhamento = new ArrayList<>();

    public ConjuntoDePessoas() {
        for (int i = 0 ; i < 26 ; i++) {
            espalhamento.add(new LinkedList<>());
        }
    }

    @Override
    public void adicionar(Pessoa pessoa) {
        if (!contem(pessoa)) {
            int indice = encontraIndice(pessoa.getNome());
            LinkedList<Pessoa> lista = espalhamento.get(indice);
            lista.add(pessoa);
        }
    }

    private boolean contem(Pessoa pessoa) {
        int indice = encontraIndice(pessoa.getNome());
        return this.espalhamento.get(indice).contains(pessoa);
    }

    private int encontraIndice(String nome) {
        return nome.toLowerCase().charAt(0) % 25;
    }

    @Override
    public Pessoa buscar(String nome) {
        return null;
    }

    @Override
    public void remover(Pessoa pessoa) {
        int indice = encontraIndice(pessoa.getNome());
        LinkedList<Pessoa> lista = this.espalhamento.get(indice);
        lista.remove(pessoa);
    }

    @Override
    public void listarTodos() {
        System.out.println(this.espalhamento);
    }
}
