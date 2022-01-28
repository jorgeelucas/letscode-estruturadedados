package br.com.letscode.ed.listas.vetores;

import java.util.Objects;

import br.com.letscode.dominio.Pessoa;
import br.com.letscode.ed.EstruturaDados;

public class ListaDePessoas implements EstruturaDados {

    private Pessoa[] pessoas = new Pessoa[10];
    private int index = 0;

    @Override
    public void adicionar(Pessoa pessoa) {
        this.pessoas[index] = pessoa;
        this.index++;
    }

    @Override
    public Pessoa buscar(String nome) {
        for (int i = 0 ; i < this.index; i++) {
            if (Objects.equals(this.pessoas[i].getIdade(), nome)) {
                return this.pessoas[i];
            }
        }
        throw new RuntimeException(nome + " não encontrado");
    }

    @Override
    public void remover(Pessoa pessoa) {
        Pessoa[] pessoas = new Pessoa[10];
        int index = 0;

        for (int i = 0 ; i < this.index; i++) {
            if (this.pessoas[i].getNome() != pessoa.getNome()) {
                pessoas[index] = this.pessoas[i];
                index++;
            }
        }
        this.pessoas = pessoas;
        this.index = index;
    }

    @Override
    public void remover(int index) {
        this.pessoas[index] = new Pessoa();
    }

    @Override
    public void listarTodos() {
        for (int i = 0 ; i < this.index; i++) {
            System.out.println(this.pessoas[i]);
        }
    }

    @Override
    public Pessoa getPessoa(int index) {
        return null;
    }
}
