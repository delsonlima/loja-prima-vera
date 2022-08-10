package br.com.bb.letscode.projetofinal4.lojaprimavera.model;

import br.com.bb.letscode.projetofinal4.lojaprimavera.model.enums.TipoProduto;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduto;
    private String nome;
    private Integer codigo;
    private BigDecimal preco;
    private BigDecimal desconto;
    private Integer quantidade;
    private TipoProduto tipoProduto;

}
