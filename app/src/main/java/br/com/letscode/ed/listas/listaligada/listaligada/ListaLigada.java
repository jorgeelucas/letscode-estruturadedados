package br.com.letscode.ed.listas.listaligada.listaligada;

import br.com.letscode.dominio.Pessoa;
import br.com.letscode.ed.EstruturaDados;

public class ListaLigada implements EstruturaDados {

    private Celula primeiro;
    private Celula ultimo;
    private int totalDeElementos = 0;

    @Override
    public void adicionar(Pessoa pessoa) {
        if (this.totalDeElementos == 0) {
            adicionarNoComeco(pessoa);
        } else {
            Celula novaCelula = new Celula();
            novaCelula.setElemento(pessoa);
            novaCelula.setProximo(null);

            this.ultimo.setProximo(novaCelula);
            this.ultimo = novaCelula;
            this.totalDeElementos++;
        }
    }

    public void adicionar(Pessoa pessoa, int posicao) {
        if (!posicaoValida(posicao)) {
            throw new RuntimeException("posicao invalida");
        }

        if (posicao == 0) {
            adicionarNoComeco(pessoa);
        } else if (posicao == this.totalDeElementos) {
            adicionar(pessoa);
        } else {
            Celula nova = new Celula();
            nova.setElemento(pessoa);

            Celula anterior = getCelula(posicao-1);
            nova.setProximo(anterior.getProximo());
            anterior.setProximo(nova);

            this.totalDeElementos++;
        }
    }

    public void adicionarNoComeco(Pessoa pessoa) {
        Celula nova = new Celula();
        nova.setElemento(pessoa);
        nova.setProximo(primeiro);

        this.primeiro = nova;

        if (totalDeElementos == 0) {
            this.ultimo = primeiro;
        }
        this.totalDeElementos++;
    }

    public Celula getCelula(int posicao) {
        if (!posicaoValida(posicao)) {
            throw new RuntimeException("Posicao invalida");
        }

        Celula atual = this.primeiro;

        for (int i = 0 ; i < posicao ; i++) {
            atual = atual.getProximo();
        }

        return atual;
    }

    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao < totalDeElementos;
    }

    @Override
    public Pessoa buscar(String nome) {
        return null;
    }

    @Override
    public void remover(Pessoa pessoa) {
    }

    @Override
    public void remover(int posicao) {
        if (!posicaoValida(posicao)) {
            throw new RuntimeException("posicao invalida");
        }

        if (posicao == 0) {

            Celula segundo = this.primeiro.getProximo();
            this.primeiro = segundo;

        } else if (posicao == this.totalDeElementos) {
            Celula penultimo = getCelula(posicao - 1);
            this.ultimo = penultimo;
        } else {
            Celula anterior = getCelula(posicao - 1);
            anterior.setProximo(anterior.getProximo().getProximo());
        }
        this.totalDeElementos--;
    }

    @Override
    public void listarTodos() {
        if (totalDeElementos == 0) {
            System.out.println("[]");
        } else {
            Celula atual = primeiro;

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
