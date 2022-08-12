package br.com.bb.letscode.projetofinal4.lojaprimavera.service;

import br.com.bb.letscode.projetofinal4.lojaprimavera.controller.dto.ClienteDTO;
import br.com.bb.letscode.projetofinal4.lojaprimavera.controller.form.ClienteForm;
import br.com.bb.letscode.projetofinal4.lojaprimavera.model.Cartao;
import br.com.bb.letscode.projetofinal4.lojaprimavera.model.Cliente;
import br.com.bb.letscode.projetofinal4.lojaprimavera.model.Endereco;
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
    public Cliente salvar (ClienteForm clienteForm) {
        return clienteRepository.save(ClienteForm.desconverte(clienteForm));
    }

    @Override
    @Transactional(readOnly = true)
    public List<ClienteDTO> listar() {
        return ClienteDTO.converteListar(clienteRepository.findAll());
    }

    @Override
    @Transactional
    public boolean cadastraCartao(Long id, Cartao cartao) {
        clienteRepository.getReferenceById(id).adicionaCartao(cartao);
        return true;
    }

    @Override
    public boolean cadastraEndereco(Long id, Endereco endereco) {
        return false;
    }


}
