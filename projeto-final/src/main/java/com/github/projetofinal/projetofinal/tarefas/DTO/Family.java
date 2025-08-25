package com.github.projetofinal.projetofinal.tarefas.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Family {
    private String father;
    private String son;
    private String mother;
    private String daughter;
    private String wife;
}
