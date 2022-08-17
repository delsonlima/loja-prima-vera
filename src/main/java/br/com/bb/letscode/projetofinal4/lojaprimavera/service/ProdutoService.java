package br.com.bb.letscode.projetofinal4.lojaprimavera.service;

import br.com.bb.letscode.projetofinal4.lojaprimavera.controller.dto.ClienteDTO;
import br.com.bb.letscode.projetofinal4.lojaprimavera.controller.dto.ProdutoDTO;
import br.com.bb.letscode.projetofinal4.lojaprimavera.controller.form.ProdutoForm;
import br.com.bb.letscode.projetofinal4.lojaprimavera.model.Produto;
import br.com.bb.letscode.projetofinal4.lojaprimavera.repository.ProdutoRepository;
import br.com.bb.letscode.projetofinal4.lojaprimavera.service.interfaces.ProdutoServiceInterface;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProdutoService implements ProdutoServiceInterface {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    public Produto salvar(ProdutoForm produtoForm) {
        Produto produto = new Produto(produtoForm);

        return produtoRepository.save(produto);
    }

    @Override
    public void excluir(Long idProduto) {
        produtoRepository.deleteById(idProduto);
    }

    @Override
    @Transactional(readOnly = true)
    public List<ProdutoDTO> listar() {
        return ProdutoDTO.converteLista(produtoRepository.findAll());
    }

    @Override
    public Produto getId(Long Id) {
        return produtoRepository.getReferenceById(Id);
    }


}


