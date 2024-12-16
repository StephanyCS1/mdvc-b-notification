package com.bimoney.msvcnotifications.Ports.Out;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;


public class RequestHttp {

    private Gson gson = new Gson();

    public String sendPostRequest(String url, String jsonBody) throws Exception {
        // Crear el HttpClient
        HttpClient client = HttpClient.newHttpClient();

        // Crear la solicitud POST con la URL y el body
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Content-Type", "application/json") // Configurar el tipo de contenido
                .POST(HttpRequest.BodyPublishers.ofString(jsonBody, StandardCharsets.UTF_8)) // Cuerpo de la solicitud
                .build();

        // Enviar la solicitud y obtener la respuesta
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        // Retornar el cuerpo de la respuesta
        return response.body();
    }



}
