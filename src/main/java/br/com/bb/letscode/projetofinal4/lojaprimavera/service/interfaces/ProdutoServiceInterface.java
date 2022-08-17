package br.com.bb.letscode.projetofinal4.lojaprimavera.service.interfaces;

import br.com.bb.letscode.projetofinal4.lojaprimavera.controller.dto.ProdutoDTO;
import br.com.bb.letscode.projetofinal4.lojaprimavera.controller.form.ProdutoForm;
import br.com.bb.letscode.projetofinal4.lojaprimavera.model.Produto;

import java.util.List;

public interface ProdutoServiceInterface {

    Produto salvar(ProdutoForm produtoForm);
    void excluir(Long idProduto);
    List<ProdutoDTO> listar();
    Produto getId(Long Id);
}
