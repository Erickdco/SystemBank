package br.com.meebank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidaTelefone {

	public boolean validaTelefone(String numeroTell) {
		// Expressão regular ajustada para maior flexibilidade
		String regex = "^\\d{2}\\s?9\\d{4}\\s?-?\\d{4}$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(numeroTell);

		if (matcher.matches()) {
			System.out.println("O número de telefone é válido!");
			return true;
		} else {
			System.out.println("O número de telefone é inválido!");
			return false;

		}
	}
}