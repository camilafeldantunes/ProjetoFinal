package com.github.projetofinal.projetofinal.tarefas.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Debut {
    private String anime;
    private String appearsIn;
}
