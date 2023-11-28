package com.github.projetofinal.projetofinal.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class DebutClientResponse {

    private String anime;
    private String appearsIn;
}
