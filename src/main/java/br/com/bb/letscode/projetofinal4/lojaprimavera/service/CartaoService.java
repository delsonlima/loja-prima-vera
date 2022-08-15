package br.com.bb.letscode.projetofinal4.lojaprimavera.service;

import br.com.bb.letscode.projetofinal4.lojaprimavera.controller.form.CartaoForm;
import br.com.bb.letscode.projetofinal4.lojaprimavera.model.Cartao;
import br.com.bb.letscode.projetofinal4.lojaprimavera.model.Cliente;
import br.com.bb.letscode.projetofinal4.lojaprimavera.repository.CartaoRepository;
import br.com.bb.letscode.projetofinal4.lojaprimavera.repository.ClienteRepository;
import br.com.bb.letscode.projetofinal4.lojaprimavera.repository.EnderecoRepository;
import br.com.bb.letscode.projetofinal4.lojaprimavera.service.interfaces.CartaoServiceInterface;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;
import java.util.Random;

@Service
//@NoArgsConstructor
public class CartaoService implements CartaoServiceInterface {

    private final CartaoRepository cartaoRepository;
    private final ClienteRepository clienteRepository;

    public CartaoService(CartaoRepository cartaoRepository, ClienteRepository clienteRepository) {
        this.cartaoRepository = cartaoRepository;
        this.clienteRepository = clienteRepository;
    }

    @Override
    public Cartao salvar(CartaoForm cartaoForm) {
        Optional<Cliente> clienteOptional = clienteRepository.findById(cartaoForm.getClienteId());
        if (clienteOptional.isEmpty()) {
            throw new RuntimeException("Cliente não encontrado");
        }

        Cartao cartao = new Cartao();
        cartao.setNumero(cartaoForm.getNumero());
        cartao.setValidade(cartao.getValidade());
        cartao.setCvv(cartao.getCvv());
        cartao.setCliente(clienteOptional.get());

        return cartaoRepository.save(cartao);
    }


}

