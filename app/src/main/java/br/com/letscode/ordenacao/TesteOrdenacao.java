package br.com.letscode.ordenacao;

import java.util.Arrays;
import java.util.Random;

public class TesteOrdenacao {
    public static void main(String[] args) {
//        int[] vetor = {2,6,8,4,3};
//        int[] vetor = {2,1,3,4,5,6};
        int[] vetor = createArray();

        AlgoritmoDeOrdenacao ordenacao = new QuickSort();

        ordenar(ordenacao, vetor);

        System.out.println(Arrays.toString(vetor));
    }

    public static void ordenar(AlgoritmoDeOrdenacao algoritmo, int[] vetor) {
        System.out.println("Ordenando array...");
        long inicio = System.currentTimeMillis();
        algoritmo.ordenar(vetor);
        long fim = System.currentTimeMillis();
        System.out.println("A ordenação com " + algoritmo.getClass().getSimpleName() +" levou " + (fim-inicio) + " milisegundos");
    }

    public static int[] createArray() {
        int mil = 1000;
        int dezMil = 10_000;
        int cemMil = 100_000;

        int[] array = new int[cemMil];
        for (int i = 0 ; i < cemMil ; i++) {
            array[i] = i;
        }

        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            int randomIndexToSwap = rand.nextInt(array.length);
            int temp = array[randomIndexToSwap];
            array[randomIndexToSwap] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
