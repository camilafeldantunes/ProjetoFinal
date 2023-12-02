package com.github.projetofinal.projetofinal.tarefas.controller;

import com.github.projetofinal.projetofinal.tarefas.DTO.NarutoResponse;
import com.github.projetofinal.projetofinal.tarefas.service.TarefasFacedes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/narutos", produces = MediaType.APPLICATION_JSON_VALUE)
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

    @DeleteMapping("/{tarefaId}")
    @ResponseBody
    public String deletar(@PathVariable("tarefaId") Long tarefaId){

        return tarefasFacedes.delete(tarefaId);
    }

}
