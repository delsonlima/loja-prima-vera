package br.com.bb.letscode.projetofinal4.lojaprimavera.model;

public class PessoaJuridica extends Pessoa{

    private String cnpj;


    @Override
    public String getDocumento() {
        return this.cnpj;
    }

    @Override
    public void setDocumento(String cnpj) {
        this.cnpj = cnpj;
    }
}
