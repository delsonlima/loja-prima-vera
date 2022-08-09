package br.com.bb.letscode.projetofinal4.lojaprimavera.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Compra {

    // @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idCompra;
    private Cliente<?> cliente;
    private Cartao cartao; // Meio de pagamento
    private LocalDate dataCompra;
    private LocalTime horaCompra;
    private BigDecimal valorTotal;
    private BigDecimal valorTotalAPagar;
    private BigDecimal valorDescontos;
    private BigDecimal valorTaxas;
    private List<Produto> produtos;

}
