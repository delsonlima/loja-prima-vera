package br.com.bb.letscode.projetofinal4.lojaprimavera.service.interfaces;

import br.com.bb.letscode.projetofinal4.lojaprimavera.controller.form.CartaoForm;
import br.com.bb.letscode.projetofinal4.lojaprimavera.model.Cartao;

import java.util.Optional;

public interface CartaoServiceInterface {

    Cartao salvar(CartaoForm cartao);
    Cartao geraCartao();

}
