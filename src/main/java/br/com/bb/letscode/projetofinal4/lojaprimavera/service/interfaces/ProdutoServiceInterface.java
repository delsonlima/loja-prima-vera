package br.com.bb.letscode.projetofinal4.lojaprimavera.service.interfaces;

import br.com.bb.letscode.projetofinal4.lojaprimavera.model.Produto;

import java.util.List;

public interface ProdutoServiceInterface {

    Produto salvar(Produto produto);
    void excluir(Long idProduto);
    List<Produto> listar();
//    Produto getId(Long Id);
}
