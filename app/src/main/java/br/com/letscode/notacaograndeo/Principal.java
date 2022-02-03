package br.com.letscode.notacaograndeo;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Principal {
    public static void main(String[] args) {

        String[] palavras = {"um", "dois", "tres"};

        boolean isDuplicados = isPalavraDuplicada(palavras);

        System.out.println(isDuplicados ? "Existem elementos duplicados" : "Não existem elementos duplicados");

    }

    private static boolean isPalavraDuplicada(String[] palavras) {
        Set<String> setDePalavras = new HashSet<>();

        for (String palavra : palavras) {
            if (!setDePalavras.add(palavra)) {
                return true;
            }
        }

        return false;
    }

}
