package br.com.letscode.dominio;

import java.util.Random;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {
    private String nome;
    private Integer idade;

    public Pessoa(String nome) {
        this.nome = nome;
        this.idade = new Random().nextInt(90);
    }
}
