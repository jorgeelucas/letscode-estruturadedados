package br.com.letscode.listas.listaligada.listaligada;

import br.com.letscode.dominio.Pessoa;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Celula {
    private Pessoa elemento;
    private Celula proximo;
}
