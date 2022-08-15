package br.com.bb.letscode.projetofinal4.lojaprimavera.model;

import br.com.bb.letscode.projetofinal4.lojaprimavera.controller.form.EnderecoForm;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String rua;
    private String lote;
    private String numero;
    private String tipoDoEndereco;
    private String bairro;
    private String cidade;
    private String estado;

    public Endereco(EnderecoForm enderecoForm) {
        this.rua = enderecoForm.getRua();
        this.lote = enderecoForm.getLote();
        this.numero = enderecoForm.getNumero();
        this.tipoDoEndereco = enderecoForm.getTipoEndereco();
        this.bairro = enderecoForm.getBairro();
        this.cidade = enderecoForm.getCidade();
        this.estado = enderecoForm.getEstado();
    }

    @OneToOne(mappedBy = "endereco")
    private Cliente cliente;

}
