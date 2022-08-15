package br.com.bb.letscode.projetofinal4.lojaprimavera.controller;


import br.com.bb.letscode.projetofinal4.lojaprimavera.service.interfaces.ProdutoServiceInterface;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    private final ProdutoServiceInterface produtoServiceInterface;

    public ProdutoController(ProdutoServiceInterface produtoServiceInterface) {
        this.produtoServiceInterface = produtoServiceInterface;
    }




}
