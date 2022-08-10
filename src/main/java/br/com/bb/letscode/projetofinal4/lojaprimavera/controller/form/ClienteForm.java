package br.com.bb.letscode.projetofinal4.lojaprimavera.controller.form;

import br.com.bb.letscode.projetofinal4.lojaprimavera.model.Cliente;
import br.com.bb.letscode.projetofinal4.lojaprimavera.model.enums.TipoPessoa;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
public class ClienteForm {

    private Long id;
    private String email;
    private String nome;
    private TipoPessoa tipoPessoa;

    public ClienteForm(Cliente cliente) {
        this.id = cliente.getId();
        this.email = cliente.getEmail();
        this.nome = cliente.getNome();
    }

    public static List<ClienteForm> converteListar(List<Cliente> topicos){
        return topicos.stream().map(ClienteForm::new).collect(Collectors.toList());
    }

    public static Cliente desconverte(ClienteForm clienteForm){
        Cliente cliente = new Cliente();
        cliente.setEmail(clienteForm.getEmail());
        cliente.setId(clienteForm.getId());
        cliente.setNome(clienteForm.getNome());
        return cliente;

    }

}
