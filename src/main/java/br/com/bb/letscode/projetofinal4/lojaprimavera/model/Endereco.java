package br.com.bb.letscode.projetofinal4.lojaprimavera.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Endereco {

    private String rua;
    private String lote;
    private String numero;
    private String tipoDoEndereco;
    private String bairro;
    private String cidade;
    private String estado;

}
