package br.com.meebank;

import java.util.Scanner;

public class Cambio {
	private Conta conta;

	public Cambio(Conta conta) {

		this.conta = conta;

	}

	public double comprarDolar() {

		Scanner Digitar = new Scanner(System.in);

		double taxaDeCambio = 3.00;
		double dolarAvenda = conta.getDolar() + taxaDeCambio;

		if (conta.getDolar() < dolarAvenda) {

			System.out.println("Não foi possível realizar essa transação por falta de saldo");

			Digitar.close();

			return conta.getSaldo();

		} else {

			System.out.println("Insira o valor US$: ");
			double validarDolar = Digitar.nextDouble();

			System.out.println(validarDolar);
			double iof = 1.1;

			double spread = 0.85;

			double precoDolarCambio = (validarDolar * dolarAvenda);

			// Preço do dolar com taxa de iof
			double precoDolarComIof = precoDolarCambio - (precoDolarCambio * iof);

			double precoDolarEmReal = precoDolarCambio - precoDolarComIof;

			/*
			 * Testes de taxas System.out.println(precoDolarComIof);
			 * System.out.println(precoDolarEmReal + "gtygty");
			 */

			// double valorCompraDolar = validarDolar - ((validarDolar * dolar) * iof);

			if (precoDolarEmReal > conta.getSaldo()) {

				double valorMaxDeDolar = conta.getSaldo() / dolarAvenda;

				System.out.println(
						"Cambio não realizado, devido falta de saldo! + O seu saldo atual é de: " + conta.getSaldo());
				System.out.println("O valor máximo que o saldo permite cambiar é de:" + valorMaxDeDolar + "US$");

				// System.out.println("Paraa realizar um cambio de dólar, o valor máximo que
				// você pode comprar é de " + );
				Digitar.close();

				return conta.getSaldo();
			} else {

				double novoSaldo = conta.getSaldo() - precoDolarEmReal;

				conta.setSaldoConta(novoSaldo);

				Digitar.close();
				System.out.println("O seu saldo atual é de: " + conta.getSaldo());
				return conta.getSaldo();

			}

		}

	}

}