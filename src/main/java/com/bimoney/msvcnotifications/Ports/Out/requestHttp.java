package com.bimoney.msvcnotifications.Ports.Out;

import com.google.gson.Gson;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;


public class requestHttp {

    private static final Gson gson = new Gson();

    public static void sendNotification(Object notification, String url) throws Exception {

        // Convert the notification object to JSON
        String jsonPayload = gson.toJson(notification);

        // Create the URL connection
        URL endpoint = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) endpoint.openConnection();

        try {
            // Set up the connection properties
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json; utf-8");
            connection.setRequestProperty("Accept", "application/json");
            connection.setDoOutput(true);

            // Write the JSON payload to the output stream
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = jsonPayload.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            // Check the response code
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                System.out.println("Notification sent successfully to " + url);
            } else {
                System.out.println("Failed to send notification. Response Code: " + responseCode);
            }
        } finally {
            connection.disconnect();
        }
    }

}
