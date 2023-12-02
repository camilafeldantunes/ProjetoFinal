package com.github.projetofinal.projetofinal.tarefas.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Personal {
    private String sex;
    private String classification;
    private String occupation;
    private ArrayList<String> affiliation;
}
