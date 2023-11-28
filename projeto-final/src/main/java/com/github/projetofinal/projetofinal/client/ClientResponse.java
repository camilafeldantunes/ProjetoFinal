package com.github.projetofinal.projetofinal.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientResponse {

    private int id;
    private String name;
    List<String> images;
    private DebutClientResponse debut;
    private Array jutsu;
    private PersonalClientResponse personal;
    private Objects family;
    private Array natureType;
    private Array uniqueTraits;
    private Objects voiceActors;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public DebutClientResponse getDebut() {
        return debut;
    }

    public void setDebut(DebutClientResponse debut) {
        this.debut = debut;
    }

    public Array getJutsu() {
        return jutsu;
    }

    public void setJutsu(Array jutsu) {
        this.jutsu = jutsu;
    }

    public PersonalClientResponse getPersonal() {
        return personal;
    }

    public void setPersonal(PersonalClientResponse personal) {
        this.personal = personal;
    }

    public Objects getFamily() {
        return family;
    }

    public void setFamily(Objects family) {
        this.family = family;
    }

    public Array getNatureType() {
        return natureType;
    }

    public void setNatureType(Array natureType) {
        this.natureType = natureType;
    }

    public Array getUniqueTraits() {
        return uniqueTraits;
    }

    public void setUniqueTraits(Array uniqueTraits) {
        this.uniqueTraits = uniqueTraits;
    }

    public Objects getVoiceActors() {
        return voiceActors;
    }

    public void setVoiceActors(Objects voiceActors) {
        this.voiceActors = voiceActors;
    }
}
