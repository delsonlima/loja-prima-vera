package br.com.bb.letscode.projetofinal4.lojaprimavera.model;

import br.com.bb.letscode.projetofinal4.lojaprimavera.model.enums.TipoProduto;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Produto {

    private String nome;

    private Integer codigo;

    private BigDecimal preco;

    private BigDecimal desconto;

    private Integer quantidade;

    private TipoProduto tipoProduto;

    public Produto(String nome, Integer codigo, BigDecimal preco, BigDecimal desconto, Integer quantidade) {
        setNome(nome);
        setCodigo(codigo);
        setPreco(preco);
        setDesconto(desconto);
        setQuantidade(quantidade);
    }

    public Produto() {
        new Produto("", 0, new BigDecimal(0), new BigDecimal(0), 0);
    }

}
