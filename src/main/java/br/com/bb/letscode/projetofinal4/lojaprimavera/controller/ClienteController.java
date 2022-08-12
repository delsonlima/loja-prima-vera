package br.com.bb.letscode.projetofinal4.lojaprimavera.controller;

import br.com.bb.letscode.projetofinal4.lojaprimavera.controller.dto.ClienteDTO;
import br.com.bb.letscode.projetofinal4.lojaprimavera.controller.form.CartaoForm;
import br.com.bb.letscode.projetofinal4.lojaprimavera.controller.form.ClienteForm;
import br.com.bb.letscode.projetofinal4.lojaprimavera.model.Cartao;
import br.com.bb.letscode.projetofinal4.lojaprimavera.model.Cliente;
import br.com.bb.letscode.projetofinal4.lojaprimavera.model.enums.TipoPessoa;
import br.com.bb.letscode.projetofinal4.lojaprimavera.repository.CartaoRepository;
import br.com.bb.letscode.projetofinal4.lojaprimavera.service.interfaces.CartaoServiceInterface;
import br.com.bb.letscode.projetofinal4.lojaprimavera.service.interfaces.ClienteServiceInterface;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private final ClienteServiceInterface clienteServiceInterface;
    private final CartaoServiceInterface cartaoServiceInterface;

    public ClienteController(ClienteServiceInterface clienteServiceInterface, CartaoRepository cartaoRepository, CartaoServiceInterface cartaoServiceInterface) {
        this.clienteServiceInterface = clienteServiceInterface;
        this.cartaoServiceInterface = cartaoServiceInterface;
    }

    @Operation(description = "Salvar cliente")
    @PostMapping("/cadastraCliente")
    public ResponseEntity<Cliente> salvar(@RequestParam @Valid String email, String nome, TipoPessoa tipoPessoa) {
        ClienteForm clienteForm = new ClienteForm(null, email, nome, tipoPessoa);
        return ResponseEntity.ok(clienteServiceInterface.salvar(clienteForm));
    }

    @GetMapping("/getClientes")
    public ResponseEntity<List<ClienteDTO>> listar() {
        return ResponseEntity.ok(clienteServiceInterface.listar());
    }

    @PostMapping("/cadastraCartao")
    public ResponseEntity<Cartao> adicionaCartao(@RequestBody CartaoForm cartaoForm) {
        return ResponseEntity.ok(cartaoServiceInterface.salvar(cartaoForm));

    }
}