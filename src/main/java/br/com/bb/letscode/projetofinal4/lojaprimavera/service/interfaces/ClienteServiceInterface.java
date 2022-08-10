package br.com.bb.letscode.projetofinal4.lojaprimavera.service.interfaces;

import br.com.bb.letscode.projetofinal4.lojaprimavera.model.Cliente;

import java.util.List;

public interface ClienteServiceInterface {

    Cliente salvar(Cliente cliente);

    List<Cliente> listar();

}
