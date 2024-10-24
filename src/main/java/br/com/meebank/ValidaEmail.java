package br.com.meebank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.net.URL;

public class ValidaEmail {

    // Chave da API
    private static final String API_KEY = "2b42b903d31dd560e037879cc18caf5abdef74c8"; // Insira sua API Key aqui.

    // URL base da API do Hunter.io
    private static final String API_URL = "https://api.hunter.io/v2/email-verifier";

    public boolean validarEmail(String email) {
        try {
            // Codificando o e-mail para garantir que ele seja compatível com a URL
            String emailEncoded = URLEncoder.encode(email, "UTF-8");

            // Montando a URL com o e-mail e a API key
            String urlString = API_URL + "?email=" + emailEncoded + "&api_key=" + API_KEY;
            URL url = new URL(urlString);

            // Abrindo a conexão HTTP
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            conexao.setRequestMethod("GET");

            // Obtendo o código de resposta da API
            int responseCode = conexao.getResponseCode();

            // Se a requisição foi bem-sucedida (código 200)
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                // Lendo a resposta da API
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                // Exibindo a resposta no console
                System.out.println("A resposta da API é: " + response.toString());
                return true;

            } else {
                // Caso haja erro na requisição
                System.out.println("Houve um erro na requisição! Código de resposta: " + responseCode);
                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
