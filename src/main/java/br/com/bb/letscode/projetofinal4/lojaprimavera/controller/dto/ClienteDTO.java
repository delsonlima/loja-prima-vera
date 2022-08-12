package br.com.bb.letscode.projetofinal4.lojaprimavera.controller.dto;

import br.com.bb.letscode.projetofinal4.lojaprimavera.model.Cliente;
import br.com.bb.letscode.projetofinal4.lojaprimavera.model.enums.TipoPessoa;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;


@Getter
@NoArgsConstructor
public class ClienteDTO {

    private Long id;
    private String email;
    private String nome;
    private TipoPessoa tipoPessoa;

    public ClienteDTO(Cliente cliente) {
        this.id = cliente.getId();
        this.email = cliente.getEmail();
        this.nome = cliente.getNome();
        this.tipoPessoa = cliente.getTipoPessoa();
    }

    public static List<ClienteDTO> converteListar(List<Cliente> clienteList){
        return clienteList.stream().map(ClienteDTO::new).collect(Collectors.toList());
    }

    public static ClienteDTO converter(Cliente cliente){
        return new ClienteDTO(cliente);
    }




}
