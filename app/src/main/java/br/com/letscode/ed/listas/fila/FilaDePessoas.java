package br.com.letscode.ed.listas.fila;

import java.util.LinkedList;

import br.com.letscode.dominio.Pessoa;

public class FilaDePessoas {
    // FIFO - PRIMEIRO A ENTRAR, PRIMEIRO A SAIR PEPS

    private LinkedList<Pessoa> pessoas = new LinkedList<>();

    public void adicionar(Pessoa pessoa) {
        this.pessoas.add(pessoa);
    }

    public Pessoa remover() {
        return this.pessoas.removeFirst();
    }

    public Pessoa pegar() {
        return this.pessoas.getFirst();
    }

    public boolean isVazio() {
        return this.pessoas.isEmpty();
    }

    @Override
    public String toString() {
        return this.pessoas.toString();
    }
}
