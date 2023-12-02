package com.github.projetofinal.projetofinal.tarefas.controller;

import com.github.projetofinal.projetofinal.tarefas.DTO.NarutoResponse;
import com.github.projetofinal.projetofinal.tarefas.service.TarefasFacedes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/character", produces = MediaType.APPLICATION_JSON_VALUE)
public class NarutoController {

    @Autowired
    private TarefasFacedes tarefasFacedes;

    //Criando métodos (criar, atualizar, retornar, excluir)
    @PostMapping
    @ResponseBody
    public NarutoResponse criar(@RequestBody NarutoResponse narutoResponse){
        return tarefasFacedes.criar(narutoResponse);

    }

    @PutMapping("/{tarefaId}")
    @ResponseBody
    public NarutoResponse atualizar(@PathVariable("tarefaId") Long tarefaId,
                                    @RequestBody NarutoResponse narutoResponse){
        return tarefasFacedes.atualizar(narutoResponse, tarefaId);

    }

    @GetMapping
    @ResponseBody
    public List<NarutoResponse> getAll(){
        return tarefasFacedes.getAll();

    }

    @GetMapping("/{tarefaId}")
    @ResponseBody
    public NarutoResponse getById(@PathVariable("tarefaId") Long tarefaId){
        return tarefasFacedes.getById(tarefaId);
    }

    @DeleteMapping("/{tarefaId}")
    @ResponseBody
    public String deletar(@PathVariable("tarefaId") Long tarefaId){

        return tarefasFacedes.delete(tarefaId);
    }

}
