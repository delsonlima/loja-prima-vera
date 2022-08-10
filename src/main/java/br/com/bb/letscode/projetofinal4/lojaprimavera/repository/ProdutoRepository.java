package br.com.bb.letscode.projetofinal4.lojaprimavera.repository;

import br.com.bb.letscode.projetofinal4.lojaprimavera.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    List<Produto> findByNomeContaining(String nome);

}
