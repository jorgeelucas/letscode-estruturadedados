package br.com.letscode.ed.listas.pilha;

import java.util.LinkedList;

import br.com.letscode.dominio.Pessoa;

public class PilhaDePessoas {

    private LinkedList<Pessoa> pessoas = new LinkedList<>();

    public void adicionar(Pessoa pessoa) {
        this.pessoas.add(pessoa);
    }

    public Pessoa remover() {
        return this.pessoas.removeLast();
    }

    public Pessoa pegar() {
        return this.pessoas.getLast();
    }

    public boolean isVazio() {
        return this.pessoas.isEmpty();
    }

    @Override
    public String toString() {
        return this.pessoas.toString();
    }
}
