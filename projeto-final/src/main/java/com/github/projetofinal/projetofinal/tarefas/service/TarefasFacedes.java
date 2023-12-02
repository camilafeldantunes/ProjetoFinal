package com.github.projetofinal.projetofinal.tarefas.service;

import com.github.projetofinal.projetofinal.tarefas.DTO.NarutoResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TarefasFacedes {
    private static final Map<Long, NarutoResponse> narutos = new HashMap<>();

    // Criar Registro
    public NarutoResponse criar(NarutoResponse narutoResponse){
        Long proximoId = narutos.keySet().size() + 1L;
        narutoResponse.setId(proximoId);
        narutos.put(proximoId, narutoResponse);
        return narutoResponse;
    }

    // Atualizar Registro
    public NarutoResponse atualizar(NarutoResponse narutoResponse, Long tarefaId){
        narutos.put(tarefaId, narutoResponse);
        return narutoResponse;
    }

    // Pegar Registro pelo ID
    public NarutoResponse getById(Long tarefaId){
        return narutos.get(tarefaId);
    }

    // Pegar todos os registros
    public List<NarutoResponse> getAll(){
        return new ArrayList<>(narutos.values());

    }

    // Excluir registros
    public String delete(Long tarefaId){
        narutos.remove(tarefaId);
        return "DELETED";

    }
}
