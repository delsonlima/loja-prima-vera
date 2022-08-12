package br.com.bb.letscode.projetofinal4.lojaprimavera.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Cartao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numero;
    private int cvv;
    private LocalDate validade;
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    public Cartao(String numero, int cvv, LocalDate validade) {
        this.numero = numero;
        this.cvv = cvv;
        this.validade = validade;
    }
}
