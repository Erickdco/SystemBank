package br.com.meebank;

public class Teste {

	public static void main(String[] args) {

		Conta contaCorrente = new Conta();
		Conta contaPoupanca = new Conta();
		Conta contaInvestimento = new Conta();
		Cambio CambioFisico = new Cambio(contaCorrente);
		Cliente pessoaFisica = new Cliente();
		RecargaCelular recarga = new RecargaCelular(contaCorrente);
		 Pix chavePix = new Pix();
		 

		Extrato transacao = new Extrato();

		contaCorrente.setNumeroConta(11);
		contaCorrente.setSaldoConta(80);
		pessoaFisica.setNome("Ralefar");
		pessoaFisica.setIdade(1);
		// chavePix.RegistroChaveTel();

		// contaPoupanca.numeroConta = 22;
		// contaPoupanca.saldoConta = 450.0;
		// contaPoupanca.cliente.nome = "Mauricio";
		// contaCorrente.cliente.idade = 38;

		// contaInvestimento.numeroConta = 46;
		// contaInvestimento.saldoConta = 750.92;
		// contaInvestimento.cliente.nome = "Balestrim";
		// contaInvestimento.cliente.idade = 43;

		// System.out.println(contaCorrente.numeroConta);
		// System.out.println(contaCorrente.saldoConta);
		// System.out.println(contaCorrente.cliente.nome);
		// System.out.println(contaCorrente.cliente.idade);

		// Funcionando contaCorrente.depositar(6000);
		// Funcionando contaCorrente.retirar(500);

		// System.out.println("Teste");

		// System.out.println(contaCorrente.getNumeroConta());
		// System.out.println(contaCorrente.getSaldo());
		// System.out.println(pessoaFisica.getNome());
		// System.out.println(pessoaFisica.getIdade());

		// System.out.println( transacao.getHora());

	//	recarga.selecionarOperadora();
		//System.out.println(CambioFisico.comprarDolar());

		chavePix.realizarPix();
		
	}

}
