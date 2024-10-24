package br.com.meebank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ValidaCpf {

    public boolean validaCPF(String cpf) throws Exception {
        // Usa o CPF que é passado como parâmetro para compor a URL
        String apiURL = "https://receitaws.com.br/v1/cpf/";
        
        URL url = new URL(apiURL);
        HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
        conexao.setRequestMethod("GET");
        
        int responseCode = conexao.getResponseCode();
        if(responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(conexao.getInputStream())); 
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
                
            System.out.println("Resposta da Api:" + response.toString());        
            return true;
        } else {
            System.out.println("Erro na validação do CPF. Código de resposta: " + responseCode);
            return false;
        }
    }
}
