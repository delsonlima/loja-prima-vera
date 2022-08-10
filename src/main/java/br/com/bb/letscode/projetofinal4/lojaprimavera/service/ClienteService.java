package br.com.bb.letscode.projetofinal4.lojaprimavera.service;

import br.com.bb.letscode.projetofinal4.lojaprimavera.model.Cliente;
import br.com.bb.letscode.projetofinal4.lojaprimavera.repository.ClienteRepository;
import br.com.bb.letscode.projetofinal4.lojaprimavera.service.interfaces.ClienteServiceInterface;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClienteService implements ClienteServiceInterface {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    @Transactional
    public Cliente salvar (Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> listar() {
        return clienteRepository.findAll();
    }

}
