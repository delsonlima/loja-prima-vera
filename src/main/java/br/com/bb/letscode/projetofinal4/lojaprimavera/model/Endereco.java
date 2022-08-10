package br.com.bb.letscode.projetofinal4.lojaprimavera.model;

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

    @OneToOne(mappedBy = "endereco")
    private Cliente cliente;

}
