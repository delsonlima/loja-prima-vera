package br.com.bb.letscode.projetofinal4.lojaprimavera.controller.form;

import br.com.bb.letscode.projetofinal4.lojaprimavera.model.enums.TipoProduto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoForm {

    private String nome;
    private Integer codigo;
    private BigDecimal preco;
    private Integer quantidade;




}
