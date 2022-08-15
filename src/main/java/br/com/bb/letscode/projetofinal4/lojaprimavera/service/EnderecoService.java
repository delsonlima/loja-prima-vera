package br.com.bb.letscode.projetofinal4.lojaprimavera.service;

import br.com.bb.letscode.projetofinal4.lojaprimavera.controller.form.EnderecoForm;
import br.com.bb.letscode.projetofinal4.lojaprimavera.model.Cliente;
import br.com.bb.letscode.projetofinal4.lojaprimavera.model.Endereco;
import br.com.bb.letscode.projetofinal4.lojaprimavera.repository.ClienteRepository;
import br.com.bb.letscode.projetofinal4.lojaprimavera.repository.EnderecoRepository;
import br.com.bb.letscode.projetofinal4.lojaprimavera.service.interfaces.EnderecoServiceInterface;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class EnderecoService implements EnderecoServiceInterface {

    private final EnderecoRepository enderecoRepository;
    private final ClienteRepository clienteRepository;

    public EnderecoService(EnderecoRepository enderecoRepository, ClienteRepository clienteRepository) {
        this.enderecoRepository = enderecoRepository;
        this.clienteRepository = clienteRepository;
    }

    @Override
    public Endereco salvar(EnderecoForm enderecoForm) {
        Endereco endereco = new Endereco();
        Optional<Cliente> clienteOptional = clienteRepository.findById(enderecoForm.getIdCliente());
        if (clienteOptional.isEmpty()) {
            throw new RuntimeException("Cliente não encontrado");
        }

        endereco.setRua(enderecoForm.getRua());
        endereco.setLote(enderecoForm.getLote());
        endereco.setNumero(enderecoForm.getNumero());
        endereco.setTipoDoEndereco(enderecoForm.getTipoEndereco());
        endereco.setBairro(enderecoForm.getBairro());
        endereco.setCidade(enderecoForm.getCidade());
        endereco.setEstado(enderecoForm.getEstado());
        endereco.setCliente(clienteOptional.get());

        enderecoRepository.save(endereco);


        return enderecoRepository.save(endereco);
    }
}
