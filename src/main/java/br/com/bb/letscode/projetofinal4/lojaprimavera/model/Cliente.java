package br.com.bb.letscode.projetofinal4.lojaprimavera.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Cliente<T extends Pessoa> {

    private Pessoa cliente;
    private Endereco endereco;
    private List<Cartao> cartoes;

}
