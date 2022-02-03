package br.com.letscode.ed.mapa;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class hashmap {
    public static void main(String[] args) {

        Map<String, String> mapa = new HashMap<>();

        // não funciona com tipo primitivo
        // Map<int, String> novoMapa = new HashMap<>();

        mapa.put(null, "nova null");

        // PUT
        mapa.put("user", "maria");
        mapa.put("password", "123");
        // NAO FICA NA ORDEM (TREEMAPPING GARANTE A ORDEM DA INSERSAO)

        System.out.println(mapa);
        mapa.put("user", "maria atualizada");
        System.out.println("chave atualizada");
        System.out.println(mapa);
        // ELEMENTOS DUPLICADOS SAO ATUALIZADOS

        // GET
        System.out.println("get by chave");
        System.out.println(mapa.get("user"));

        // QUANDO BUSCA POR UMA CHAVE QUE NAO EXISTE ELE RETORNA NULLO
        System.out.println("chave inexistente");
        System.out.println(mapa.get("1234"));

        // CONTAINS KEY
        System.out.println("___");

        System.out.println("contains key");
        System.out.println(mapa.containsKey("user"));

        // FOR LOOP NAS KEY
        System.out.println("___");
        for (String chave: mapa.keySet()) {
            String valor = mapa.get(chave);
            System.out.println(chave+"="+valor);
        }

        // FOR LOOP NO PAR
        System.out.println("___");
        System.out.println("loop com pares");
        for (Entry<String, String> entrada : mapa.entrySet()) {
            // entrada.getKey();
            // entrada.getValue();
            System.out.println(entrada);
        }


        // VALUES()
        System.out.println("___");
        System.out.println("values()");
        // ArrayList<String> values = mapa.values();
        List<String> strings = new ArrayList<>(mapa.values());

        for (String valor : strings) {
            System.out.println(valor);
        }

        // VERIFICAR SE TEM LETRA REPETIDA
        // VERIFICAR SE PALAVRA SE REPETE

    }
}
