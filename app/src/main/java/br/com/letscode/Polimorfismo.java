package br.com.letscode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.letscode.dominio.Pessoa;

public class Polimorfismo {
    public static void main(String[] args) {

        List<Pessoa> lista = new LinkedList<>();

        lista.add(new Pessoa("Jorge"));
        // muito
    }

    public static void ligarTodos(Veiculo veiculo) {
        veiculo.ligar();
    }


}

class Carro implements Veiculo {

    @Override
    public void ligar() {
        System.out.println("Carro ligando");
    }

    public void fecharVidros() {
        System.out.println("Carro fechando vidros");
    }
}

class Moto implements Veiculo {

    @Override
    public void ligar() {
        System.out.println("Moto ligando");
    }

    public void travarGuidao() {
        System.out.println("Travando guidao");
    }
}

interface Veiculo {
    void ligar();
}