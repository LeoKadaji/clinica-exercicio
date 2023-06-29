package br.com.tech4me.clinica.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4me.clinica.model.DadosProcedimentos;

@RestController
@RequestMapping("/procedimentos")
public class ProcedimentosController {
    
    List<DadosProcedimentos> proced = new ArrayList();

    @GetMapping
    private List<DadosProcedimentos> ListaProcedimentos(){
        return proced;
    }

    @GetMapping("/{nome}")
    private String RequesicaoGetComParametro(@PathVariable String nome){
        return String.format("Pagina de Procedimento do Dr(a): %s", nome);
    }

    @GetMapping
    private String RequesicaoPost(@RequestBody DadosProcedimentos DadosProc){
        proced.add(DadosProc);
        return String.format("Dados Post dos procedimentos: %s", DadosProc);
    }
}

