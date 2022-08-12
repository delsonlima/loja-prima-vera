package br.com.bb.letscode.projetofinal4.lojaprimavera.controller.form;

import br.com.bb.letscode.projetofinal4.lojaprimavera.model.Cartao;
import br.com.bb.letscode.projetofinal4.lojaprimavera.model.Cliente;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CartaoForm {

    private String numero;
    private int cvv;
    private LocalDate validade;
    private Long clienteId;

}
