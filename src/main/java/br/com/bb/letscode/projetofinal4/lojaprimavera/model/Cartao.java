package br.com.bb.letscode.projetofinal4.lojaprimavera.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Cartao {

    private int numero;
    private int cvv;
    private LocalDate validade;

    public Cartao(int numero, int cvv, LocalDate validade) {
        this.numero = numero;
        this.cvv = cvv;
        this.validade = validade;
    }

}
