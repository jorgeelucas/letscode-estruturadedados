package br.com.letscode.ordenacao;

public class QuickSort implements AlgoritmoDeOrdenacao {

    @Override
    public void ordenar(int[] vetor) {
        quicksort(vetor, 0, vetor.length - 1);
    }

    public static void quicksort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int pivot = dividir(vetor, inicio, fim);
            quicksort(vetor, inicio, pivot);
            quicksort(vetor, pivot + 1, fim);
        }
    }

    public static int dividir(int[] vetor, int esquerda, int direita) {
        int meio = (esquerda + direita) / 2;
        int pivot = vetor[meio];

        int e = esquerda - 1;
        int d = direita + 1;

        while(true) {

            do {
                e++;
            } while(vetor[e] < pivot);

            do {
                d--;
            } while (vetor[d] > pivot);

            if (e >= d) {
                return d;
            }

            int aux = vetor[e];
            vetor[e] = vetor[d];
            vetor[d] = aux;

        }
    }
}
