package br.com.letscode.ordenacao;

public class BubbleSort implements AlgoritmoDeOrdenacao{

    @Override
    public void ordenar(int[] vetor) {
        boolean controle;

        for (int j = 0 ; j < vetor.length ; j++) {
            controle = true;

            for (int i = 0 ; i < vetor.length - (j + 1) ; i++) {
                if (vetor[i] > vetor[i+1]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    controle = false;
                }
            }
            if (controle) break;
        }
    }
}
