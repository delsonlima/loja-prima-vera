package br.com.bb.letscode.projetofinal4.lojaprimavera.repository;

import br.com.bb.letscode.projetofinal4.lojaprimavera.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Cliente findByEmail(String email);

}
