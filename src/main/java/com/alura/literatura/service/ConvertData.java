package com.alura.literatura.service;

import com.alura.literatura.exception.DataConversionException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

@Service
public class ConvertData implements IConvertData{

       private final ObjectMapper objectMapper;

    public ConvertData(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }
//     * Convierte un string JSON a un objeto del tipo especificado.
//     * @param json  El string JSON a convertir.
//     * @param tClass La clase del tipo al que se desea convertir el JSON.
//     * @param <T>   El tipo del objeto resultante.
//     * @return El objeto convertido.
//     * @throws DataConversionException Si ocurre un error durante la conversión.

    @Override
    public <T> T getData(String json, Class<T> clazz) {

        if (json == null || json.isEmpty()) {
            throw new IllegalArgumentException("El JSON no puede ser nulo o vacío.");
        }
        try {
            return objectMapper.readValue(json, clazz);
        } catch (JsonProcessingException e) {
            throw new DataConversionException("Error al convertir JSON a objeto " + clazz.getSimpleName(), e);
        }
    }


    private <T> T convertJsonToObject(String json, Class<T> clazz) {
        try {
            return objectMapper.readValue(json, clazz);
        } catch (JsonProcessingException e) {
            throw new DataConversionException("Error al convertir JSON a objeto " + clazz.getSimpleName(), e);
        }
    }

}
