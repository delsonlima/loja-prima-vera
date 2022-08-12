package br.com.bb.letscode.projetofinal4.lojaprimavera.model;

import br.com.bb.letscode.projetofinal4.lojaprimavera.model.enums.TipoPessoa;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String nome;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id", referencedColumnName = "id")
    private Endereco endereco;
    private TipoPessoa tipoPessoa;
    @OneToMany(mappedBy = "cliente")
    private List<Cartao> cartoes;

    public boolean adicionaCartao(Cartao cartao){
        try {
            this.cartoes.add(cartao);
            return true;
        } catch (NullPointerException nullPointerException){
            nullPointerException.printStackTrace();
            return false;
        }
    }

}
