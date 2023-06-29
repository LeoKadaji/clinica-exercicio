package br.com.tech4me.clinica.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4me.clinica.model.DadosMedicos;

@RestController
@RequestMapping("/medicos")
public class MedicosController {

    List<DadosMedicos> medicos = new ArrayList<>();

        @GetMapping
        private List<DadosMedicos> ObterListaMedicos(){
            return medicos;
        }
        
        @GetMapping("/{nome}")
        private String requesicaoGetComParametro(@PathVariable String nome){
            return String.format("Pagina com informações do Dr(a) %s", nome);
        }

        @PostMapping
        private String requesicaoPost(@RequestBody DadosMedicos dadosmedicos){
            medicos.add(dadosmedicos);
            return String.format("requesição post dados do médico: %s", dadosmedicos);
        }
    
}
