package com.alura.LiterAlura.service;

public interface IConvetirJSON {
    <T> T obtenerDatos(String json, Class<T> clase);
}
