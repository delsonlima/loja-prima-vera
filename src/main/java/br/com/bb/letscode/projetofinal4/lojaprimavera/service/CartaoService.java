package br.com.bb.letscode.projetofinal4.lojaprimavera.service;

import br.com.bb.letscode.projetofinal4.lojaprimavera.controller.form.CartaoForm;
import br.com.bb.letscode.projetofinal4.lojaprimavera.model.Cartao;
import br.com.bb.letscode.projetofinal4.lojaprimavera.model.Cliente;
import br.com.bb.letscode.projetofinal4.lojaprimavera.repository.CartaoRepository;
import br.com.bb.letscode.projetofinal4.lojaprimavera.repository.ClienteRepository;
import br.com.bb.letscode.projetofinal4.lojaprimavera.service.interfaces.CartaoServiceInterface;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;

@Service
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

        Cliente cliente = clienteOptional.get();

        Cartao cartao = new Cartao();
        cartao.setNumero(cartaoForm.getNumero());
        cartao.setValidade(cartao.getValidade());
        cartao.setCvv(cartao.getCvv());
        cartao.setCliente(cliente);

        return cartaoRepository.save(cartao);
    }

    public Cartao geraCartao(){
        Random random = new Random();
        // numero do Cartao
        StringBuilder numeroCartao = new StringBuilder();
        for(int i = 0; i<4; i++) {
            int quatroDigitos = (int) (random.nextDouble() * 1000);
            numeroCartao.append(quatroDigitos).append(" ");
        }
        // cvv
        int cvv = (int) random.nextDouble()*100;

        // validade
        LocalDate validade = LocalDate.now();
        validade = validade.plusYears(5);


        return new Cartao(numeroCartao.toString(), cvv, validade);
    }
}

