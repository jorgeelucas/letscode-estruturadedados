package br.com.letscode.ed.listas.listaduplamenteligada;

import br.com.letscode.dominio.Pessoa;
import br.com.letscode.ed.EstruturaDados;

public class ListaDuplamenteLigada implements EstruturaDados {

    private Celula primeira;
    private Celula ultima;
    private int totalDeElementos = 0;

    @Override
    public void adicionar(Pessoa pessoa) {
        if (this.totalDeElementos == 0) {
            adicionarNoComeco(pessoa);
        } else {
            Celula nova = new Celula(pessoa);

            Celula ultimaCelula = this.ultima;
            ultimaCelula.setProximo(nova);

            nova.setAnterior(ultimaCelula);
            this.ultima = nova;

            this.totalDeElementos++;
        }
    }

    public void adicionarNoComeco(Pessoa pessoa) {
        Celula nova = new Celula(pessoa);
        nova.setProximo(primeira);

        if (this.totalDeElementos == 0) {
            this.primeira = nova;
            this.ultima = nova;
        } else {
            this.primeira = nova;
            this.primeira.setAnterior(nova);
        }
        this.totalDeElementos++;
    }

    public Celula getCelula(int posicao) {
        return null;
    }

    @Override
    public Pessoa buscar(String nome) {
        return null;
    }

    @Override
    public void remover(Pessoa pessoa) {

    }

    @Override
    public void remover(int index) {

    }

    @Override
    public void listarTodos() {
        if (this.totalDeElementos == 0) {
            System.out.println("[]");
        } else {
            Celula atual = primeira;

            StringBuilder builder = new StringBuilder("[");
            for (int i = 0 ; i < totalDeElementos ; i++) {
                builder.append(atual.getElemento());
                builder.append(",");

                atual = atual.getProximo();
            }
            builder.append("]");
            System.out.println(builder);
        }

    }

    @Override
    public Pessoa getPessoa(int index) {
        return null;
    }
}
