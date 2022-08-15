package br.com.bb.letscode.projetofinal4.lojaprimavera.controller.form;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoForm {

    private String rua;
    private String lote;
    private String numero;
    private String tipoEndereco;
    private String bairro;
    private String cidade;
    private String estado;
    private Long idCliente;


}
