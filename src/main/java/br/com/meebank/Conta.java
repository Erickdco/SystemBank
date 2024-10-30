package br.com.meebank;

import java.util.Scanner;

public class Conta {

	private String nome;
	private int numeroConta;
	private double saldoConta = 1000;
	private double taxa = 0;
	private double dolar = 5.61;
	private double saldoDolar;
	private String cpf;
	private int numeroTel;

	Cliente cliente = new Cliente();

	public Conta() {

	}

	public Conta(int numeroConta) {

		this.numeroConta = numeroConta;
		// Opcional a llinha debaixo!
		this.saldoConta = 0;

	}

	public double getSaldo() {

		return saldoConta;

	}

	public void setSaldoConta(double saldoConta) {

		this.saldoConta = saldoConta;

	}

	public String getCpf() {

		return cpf;

	}

	public double getDolar() {

		return dolar;

	}

	public int getNumeroTel() {

		return numeroTel;

	}

	public void setNumeroTel(int numeroTel) {

		this.numeroTel = numeroTel;

	}

	public void depositar(double valor) {
		saldoConta = saldoConta + valor;

	}
//a
	// public void retirar(double valor) {

	// saldoConta = saldoConta - valor;

	// }

	// Sobrecarga de métodos *parametros diferentes* //

	public void retirar(double valor) {

		if (valor >= 500) {

			taxa = 0.05;

			double valorComTaxa = valor - (valor * taxa);

			saldoConta = saldoConta - valorComTaxa;

		} else {

			saldoConta = saldoConta - valor - taxa;

		}

	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;

	}

	public int getNumeroConta() {

		return numeroConta;

	}

	/*
	 * public double comprarDolar () {
	 * 
	 * Scanner Digitar = new Scanner(System.in);
	 * 
	 * double taxaDeCambio = 3.00; double dolarAvenda = dolar + taxaDeCambio;
	 * 
	 * if (saldoConta < dolarAvenda) {
	 * 
	 * System.out.
	 * println("Não foi possível realizar essa transação por falta de saldo");
	 * 
	 * Digitar.close();
	 * 
	 * return saldoConta;
	 * 
	 * } else {
	 * 
	 * System.out.println("Insira o valor US$: "); double validarDolar =
	 * Digitar.nextDouble();
	 * 
	 * System.out.println(validarDolar); double iof = 1.1;
	 * 
	 * double spread = 0.85;
	 * 
	 * double precoDolarCambio = (validarDolar * dolarAvenda);
	 * 
	 * 
	 * //Preço do dolar com taxa de iof double precoDolarComIof = precoDolarCambio -
	 * (precoDolarCambio * iof);
	 * 
	 * double precoDolarEmReal = precoDolarCambio - precoDolarComIof;
	 * 
	 * /*Testes de taxas System.out.println(precoDolarComIof);
	 * System.out.println(precoDolarEmReal + "gtygty");
	 * 
	 * //double valorCompraDolar = validarDolar - ((validarDolar * dolar) * iof);
	 * 
	 * 
	 * if (precoDolarEmReal > saldoConta) {
	 * 
	 * 
	 * double valorMaxDeDolar = saldoConta / dolarAvenda;
	 * 
	 * System.out.
	 * println("Cambio não realizado, devido falta de saldo! + O seu saldo atual é de: "
	 * + saldoConta );
	 * System.out.println("O valor máximo que o saldo permite cambiar é de:" +
	 * valorMaxDeDolar + "US$");
	 * 
	 * //System.out.
	 * println("Paraa realizar um cambio de dólar, o valor máximo que você pode comprar é de "
	 * + ); Digitar.close();
	 * 
	 * return saldoConta; } else {
	 * 
	 * saldoConta = saldoConta - precoDolarEmReal;
	 * 
	 * Digitar.close(); System.out.println("O seu saldo atual é de: "); return
	 * saldoConta;
	 * 
	 * }
	 * 
	 * } }
	 */

}
