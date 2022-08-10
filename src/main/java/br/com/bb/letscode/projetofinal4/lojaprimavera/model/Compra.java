package br.com.bb.letscode.projetofinal4.lojaprimavera.model;

import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Cliente cliente;
    private Cartao cartao; // Meio de pagamento
    private LocalDate dataCompra;
    private LocalTime horaCompra;
    private BigDecimal valorTotal;
    private BigDecimal valorTotalAPagar;
    private BigDecimal valorDescontos;
    private BigDecimal valorTaxas;
    private List<Produto> produtos;

}
