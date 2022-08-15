package br.com.bb.letscode.projetofinal4.lojaprimavera.service.interfaces;

import br.com.bb.letscode.projetofinal4.lojaprimavera.controller.form.EnderecoForm;
import br.com.bb.letscode.projetofinal4.lojaprimavera.model.Endereco;

public interface EnderecoServiceInterface {

    Endereco salvar(EnderecoForm enderecoForm);
}
