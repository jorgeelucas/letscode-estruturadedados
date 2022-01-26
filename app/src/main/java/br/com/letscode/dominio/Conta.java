package br.com.letscode.dominio;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Builder
public class Conta {

    private String titular;
    private BigDecimal saldo;
    private String numero;


}
