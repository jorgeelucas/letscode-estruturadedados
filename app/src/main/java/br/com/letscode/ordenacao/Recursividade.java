package br.com.letscode.ordenacao;

public class Recursividade {
    public static void main(String[] args) {
        int[] numeros = {2,5,3,10,20};

        int soma = somar(0, numeros);

        System.out.println(soma);

    }

    public static int somar(int posicao, int[] numeros) {
        if (posicao < numeros.length) {
            int acumulador = numeros[posicao] + somar(posicao+1, numeros);
            return acumulador;
        } else {
            return 0;
        }
    }
}
