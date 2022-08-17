package br.com.bb.letscode.projetofinal4.lojaprimavera.controller.dto;

import br.com.bb.letscode.projetofinal4.lojaprimavera.controller.form.ProdutoForm;
import br.com.bb.letscode.projetofinal4.lojaprimavera.model.Produto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoDTO {

        private Long ID;
        private String nome;
        private Integer codigo;
        private BigDecimal preco;
        private Integer quantidade;

    public ProdutoDTO(Produto produto) {
        this.ID = produto.getIdProduto();
        this.nome = produto.getNome();
        this.codigo = produto.getCodigo();
        this.preco = produto.getPreco();
        this.quantidade = produto.getQuantidade();
    }

    public static List<ProdutoDTO> converteLista(List<Produto> list){
            List<ProdutoDTO> returnList = new ArrayList<>();
            list.stream()
                    .forEach(elemento -> returnList.add(new ProdutoDTO(elemento)));
            return returnList;

        }


    }
