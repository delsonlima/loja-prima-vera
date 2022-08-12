package br.com.bb.letscode.projetofinal4.lojaprimavera.service;

import br.com.bb.letscode.projetofinal4.lojaprimavera.model.Cartao;
import br.com.bb.letscode.projetofinal4.lojaprimavera.service.interfaces.CartaoServiceInterface;
import net.bytebuddy.asm.Advice;

import java.time.LocalDate;
import java.util.Optional;
import java.util.Random;

public class CartaoService implements CartaoServiceInterface {


    public Cartao geraCartao(){
        Random random = new Random();
        // numero do Cartao
        StringBuilder numeroCartao = new StringBuilder();
        for(int i = 0; i<4; i++) {
            int quatroDigitos = (int) (random.nextDouble() * 1000);
            numeroCartao.append(quatroDigitos).append(" ");
        }
        // cvv
        int cvv = (int) random.nextDouble()*100;

        // validade
        LocalDate validade = LocalDate.now();
        validade = validade.plusYears(5);


        return new Cartao(numeroCartao.toString(), cvv, validade);
    }
    }

