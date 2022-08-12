package br.com.bb.letscode.projetofinal4.lojaprimavera.controller;

import br.com.bb.letscode.projetofinal4.lojaprimavera.controller.dto.ClienteDTO;
import br.com.bb.letscode.projetofinal4.lojaprimavera.controller.form.ClienteForm;
import br.com.bb.letscode.projetofinal4.lojaprimavera.model.Cartao;
import br.com.bb.letscode.projetofinal4.lojaprimavera.model.Cliente;
import br.com.bb.letscode.projetofinal4.lojaprimavera.model.enums.TipoPessoa;
import br.com.bb.letscode.projetofinal4.lojaprimavera.service.CartaoService;
import br.com.bb.letscode.projetofinal4.lojaprimavera.service.interfaces.ClienteServiceInterface;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

import static java.lang.Math.E;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private final ClienteServiceInterface clienteServiceInterface;

    public ClienteController(ClienteServiceInterface clienteServiceInterface) {
        this.clienteServiceInterface = clienteServiceInterface;
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

    @PutMapping("/cadastraCartao")
    public ResponseEntity<Boolean> adicionaCartao(@RequestParam Long id) {
        CartaoService cartaoService = new CartaoService();
        Cartao cartao = cartaoService.geraCartao();

        return ResponseEntity.ok(clienteServiceInterface.cadastraCartao(id, cartao));

    }
}