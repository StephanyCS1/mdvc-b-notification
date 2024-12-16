package com.bimoney.msvcnotifications.Ports.ExternalSearch;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class PostRequest {

    // Método para hacer una petición POST global
    public static String sendPostRequest(String url, String jsonBody) throws Exception {
        // Crea el cliente HTTP
        HttpClient client = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(10)) // Tiempo de espera para la conexión
                .build();

        // Construye la solicitud POST
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(url)) // URL de la petición
                .timeout(Duration.ofSeconds(20))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(jsonBody))
                .build();

        // Enviar la solicitud y obtener la respuesta
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Comprueba el código de estado de la respuesta
        if (response.statusCode() == 200 || response.statusCode() == 201) {
            return response.body(); // Retorna el cuerpo de la respuesta si es exitosa
        } else {
            throw new RuntimeException("Error en la petición: " + response.statusCode());
        }
    }

}
