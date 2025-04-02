package com.exemplo.atividade.service;

import org.springframework.stereotype.Component;

@Component
public class TransportadoraTerceirizada implements FreteStrategy {
    @Override
    public double calcular (double peso){
        return peso += 2.0;
    }

    @Override
    public String modalidade(){
        return "Transportadora Tercerizada";
    }
}
