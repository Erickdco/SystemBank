package br.com.meebank;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Extrato {

	public Extrato() {

	}

	private String tipoTransacao;
	private Conta conta;
	private String nome;

	public String getHora() {

		LocalDateTime dataHoraAtual = LocalDateTime.now();

		DateTimeFormatter Formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm:ss");

		return dataHoraAtual.format(Formatter);

	}

}
