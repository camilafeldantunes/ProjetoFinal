package com.github.projetofinal.projetofinal.controller;

import com.github.projetofinal.projetofinal.response.NarutoResponse;
import com.github.projetofinal.projetofinal.service.NarutoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
@RequestMapping("/naruto")
public class NarutoController {

    NarutoService narutoService;

    @GetMapping("/{id}")
    public Mono<String> getPersonagemById(@PathVariable String id){
       return narutoService.getPersonagemById(id);
    }


}
