package br.com.bb.letscode.projetofinal4.lojaprimavera.controller;

import br.com.bb.letscode.projetofinal4.lojaprimavera.model.Cliente;
import br.com.bb.letscode.projetofinal4.lojaprimavera.service.interfaces.ClienteServiceInterface;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private final ClienteServiceInterface clienteServiceInterface;

    public ClienteController(ClienteServiceInterface clienteServiceInterface) {
        this.clienteServiceInterface = clienteServiceInterface;
    }

    @Operation(description = "Salvar cliente")
    @PostMapping
    public ResponseEntity<Cliente> salvar(@RequestBody @Valid Cliente cliente) {
        return ResponseEntity.ok(clienteServiceInterface.salvar(cliente));
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> listar() {
        return ResponseEntity.ok(clienteServiceInterface.listar());
    }

}
