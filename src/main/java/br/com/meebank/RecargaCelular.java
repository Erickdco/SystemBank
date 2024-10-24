package br.com.meebank;

import java.util.Scanner;

public class RecargaCelular {
	private Conta conta;

	// Construtor padrão
	public RecargaCelular() {
		this.conta = null; // Inicializa como null, para evitar erro
	}

	// Construtor que aceita uma conta
	public RecargaCelular(Conta conta) {
		this.conta = conta;
	}

	// Método para definir a conta manualmente
	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public void selecionarOperadora() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Selecione o nome da operadora (Vivo, Tim, Oi, Claro):");
		String userDigitacao = scanner.nextLine();

		switch (userDigitacao) {
		case "Vivo":
			System.out.println("Operadora Vivo selecionada");
			break;
		case "Tim":
			System.out.println("Operadora Tim selecionada");
			break;
		case "Oi":
			System.out.println("Operadora Oi selecionada");
			break;
		case "Claro":
			System.out.println("Operadora Claro selecionada");
			break;
		default:
			System.out.println("Opção inválida de recarga");
			return; // Se a operadora for inválida, interrompe o processo
		}

		// Instância da classe ValidaTelefone para validação do número
		ValidaTelefone validar = new ValidaTelefone();

		System.out.println("Digite o número do celular (formato: +55 DDD NUMERO):");
		String numeroRecarga = scanner.nextLine();

		// Valida o número de telefone antes de prosseguir
		boolean telefoneValido = validar.validaTelefone(numeroRecarga);

		if (!telefoneValido) {
			System.out.println("O número de telefone é inválido. Operação cancelada.");
			return; // Interrompe a recarga se o número for inválido
		}

		System.out.println("Digite o valor da recarga:");
		int valorRecarga = scanner.nextInt();

		if (conta == null) {
			return; // Sai do método caso a conta não tenha sido inicializada
		}

		// Realiza a recarga caso o valor seja válido
		switch (valorRecarga) {
		case 20:
		case 25:
		case 30:
		case 35:
		case 40:
		case 50:
		case 100:
			if (conta.getSaldo() >= valorRecarga) {
				conta.setSaldoConta(conta.getSaldo() - valorRecarga);
				System.out.println("Recarga de R$" + valorRecarga + " efetuada!");
				System.out.println("Novo saldo: R$" + conta.getSaldo());
			} else {
				System.out.println("Saldo insuficiente para a recarga.");
			}
			break;
		default:
			System.out.println("Valor de recarga inválido.");
		}
	}
}
