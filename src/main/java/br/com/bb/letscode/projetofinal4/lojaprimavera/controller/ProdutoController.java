package br.com.bb.letscode.projetofinal4.lojaprimavera.controller;


import br.com.bb.letscode.projetofinal4.lojaprimavera.controller.dto.ProdutoDTO;
import br.com.bb.letscode.projetofinal4.lojaprimavera.controller.form.ProdutoForm;
import br.com.bb.letscode.projetofinal4.lojaprimavera.model.Produto;
import br.com.bb.letscode.projetofinal4.lojaprimavera.model.enums.TipoProduto;
import br.com.bb.letscode.projetofinal4.lojaprimavera.service.interfaces.ProdutoServiceInterface;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    private final ProdutoServiceInterface produtoServiceInterface;

    public ProdutoController(ProdutoServiceInterface produtoServiceInterface) {
        this.produtoServiceInterface = produtoServiceInterface;
    }

    @PostMapping("/cadastraProduto")
    @Operation(description = "Cadastrar novos produtos")
    public ResponseEntity<Produto> cadastrarProduto(@RequestBody ProdutoForm produtoForm){
        return ResponseEntity.ok(produtoServiceInterface.salvar(produtoForm));
    }

    @GetMapping("/getProdutos")
    @Operation(description = "Lista todos os produtos")
    public ResponseEntity<List<ProdutoDTO>> listarProdutos(){
        return ResponseEntity.ok(produtoServiceInterface.listar());
    }

    @DeleteMapping
    @Operation(description = "Operação para deletar um produto da base de dados")
    public void deletarProduto(Long IDproduto){
        produtoServiceInterface.excluir(IDproduto);

    }




}
