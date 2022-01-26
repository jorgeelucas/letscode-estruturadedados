package br.com.letscode.listas.listaligada.listaligada;

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

    public void adicionar(Pessoa pessoa, int index) {
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

    private Celula getCelula(int posicao) {
        return null;
    }

    private boolean posicaoValida(int posicao) {
        return false;
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
