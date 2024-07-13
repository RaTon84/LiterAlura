package com.alura.LiterAlura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosLibro(
        @JsonAlias("id") Integer id,
        @JsonAlias("title") String titulo,
        @JsonAlias("authors") DatosAutor autor,
        @JsonAlias("languages") String lenguaje,
        @JsonAlias("copyright") boolean copyright,
        @JsonAlias("subjects") String asignaturas
) {
}
