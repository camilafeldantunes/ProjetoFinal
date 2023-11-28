package com.github.projetofinal.projetofinal.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Array;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonalClientResponse {
    private String sex;
    private String classification;
    private String occupation;
    private Array affiliation;
}
