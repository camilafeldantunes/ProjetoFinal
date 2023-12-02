package com.github.projetofinal.projetofinal.tarefas.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class NarutoResponse {
        private Long id;
        private String name;
        private ArrayList<String> images;
        private Debut debut;
        private ArrayList<String> jutsu;
        private ArrayList<String> natureType;
        private ArrayList<String> tools;
        private Personal personal;
        private VoiceActors voiceActors;
        private Family family;
}
