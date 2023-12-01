package com.github.projetofinal.projetofinal.service;

import com.github.projetofinal.projetofinal.response.NarutoResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Service
@Slf4j
public class NarutoService {

    private final WebClient webClient;

    public NarutoService(WebClient.Builder builder) {
        webClient = builder.baseUrl("http://narutodb.xyz/api").build();

    }

    public Mono<String> getPersonagemById(String id) {
        log.info("Buscando o personagem com o id [{}]", id);
        return webClient
                .get()
                .uri("/character/" + id)
                .accept(APPLICATION_JSON)
                .retrieve()
                .onStatus(HttpStatusCode::is4xxClientError,
                        error -> Mono.error(new RuntimeException("Verifique os parâmetros informados")))
                .bodyToMono(String.class);


    }
}
