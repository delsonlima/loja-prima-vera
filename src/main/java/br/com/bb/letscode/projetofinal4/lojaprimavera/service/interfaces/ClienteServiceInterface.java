package br.com.bb.letscode.projetofinal4.lojaprimavera.service.interfaces;

import br.com.bb.letscode.projetofinal4.lojaprimavera.controller.dto.ClienteDTO;
import br.com.bb.letscode.projetofinal4.lojaprimavera.controller.form.ClienteForm;
import br.com.bb.letscode.projetofinal4.lojaprimavera.model.Cliente;

import java.util.List;

public interface ClienteServiceInterface {

    Cliente salvar(ClienteForm clienteForm);

    List<ClienteDTO> listar();

}
