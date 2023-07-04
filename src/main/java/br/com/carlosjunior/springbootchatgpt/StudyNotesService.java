package br.com.carlosjunior.springbootchatgpt;


import reactor.core.publisher.Mono;

public interface StudyNotesService {
    Mono<String> createStudyNotes(String topic);
}