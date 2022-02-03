package br.com.letscode.ordenacao;

public class SelectionSort implements AlgoritmoDeOrdenacao{

    @Override
    public void ordenar(int[] vetor) {

        int posicaoDoMenor;
        for (int i = 0; i < vetor.length; i++) {
            posicaoDoMenor = i;

            for (int j = i; j < vetor.length; j++) {
                if (vetor[j] < vetor[posicaoDoMenor]) {
                    posicaoDoMenor = j;
                }
            }

            int aux = vetor[posicaoDoMenor];
            vetor[posicaoDoMenor] = vetor[i];
            vetor[i] = aux;
        }

    }
}
