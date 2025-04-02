package com.exemplo.atividade.controller;

import com.exemplo.atividade.service.FreteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/frete")
public class FreteController {
    private final FreteService freteService;

    public FreteController(FreteService freteService) {
        this.freteService = freteService;
    }

    @GetMapping
    public String calcularFrete(@RequestParam String modalidade, @RequestParam double peso){
        double valor = freteService.calcular(modalidade, peso);
        return "O frete de modalidade: (" + modalidade + ") para o peso de (" + peso + ")kG fica ao total de R$: " + valor;
    }
}
