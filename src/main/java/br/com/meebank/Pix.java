package br.com.meebank;

import java.util.Scanner;

public class Pix {

    private ValidaTelefone validaTelefone; // Instância da classe de validação de telefone
    private ValidaEmail emailValidator; // Instância da classe de validação de e-mail
    private ValidaCpf validaroCpf;
    private ChaveAlatoria validaAlea;
    private Conta conta;
    // Construtor para inicializar as classes de validação
    public Pix() {
        this.validaTelefone = new ValidaTelefone();
        this.emailValidator = new ValidaEmail();
        this.validaroCpf = new ValidaCpf();
        this.validaAlea = new ChaveAlatoria();
        this.conta = new Conta();
        
    }

    // Método para realizar validação de telefone, e-mail e CPF
    public void realizarPix() {
       double saldoAtual = conta.getSaldo();
       Scanner escrito = new Scanner(System.in);
       System.out.println("Selcione a chave pix:");
       System.out.println("Cpf, email, telefone, aleatoria");
       
       
       
        String transferencia = escrito.nextLine();   
       switch (transferencia) {
        
        case "cpf": 
        	System.out.println("Digite o cpf");
            String cpfAserDigitado = escrito.nextLine();
            
             boolean cpfBoolValidado = validaroCpf.validar(cpfAserDigitado);
             if (cpfBoolValidado) {
             	System.out.println("Cpf valido!");
             	
            	System.out.println("Seu saldo atual é de:" + saldoAtual);
             	
             	System.out.println("Digite o valor da transferencia:");
             	double transfer = escrito.nextDouble();
             	 
             	if(conta.getSaldo()>= transfer ) {
             	double novoSaldo = saldoAtual - transfer; 
             		System.out.println("transferência concluída com sucesso!");
             		System.out.println("O seu saldo atual é de:" + novoSaldo);
             		
             	} else {
             		System.out.println("Saldo insuficiente para realizar essa transferência!");
             		System.out.println("O seu saldo é de:" + saldoAtual);
             	}
             	
             } else {
            	 
        	 System.out.println("Cpf não é valido!");
            	 
           	 return;
             }
        	break;
      case "numero":
      case "email":
      case "aleatoria":	
     
            
             		
        	
       default:
        	System.out.println("padrao");
        	
        	System.out.println("Digite o valor da transferencia:");
        	
          // if(conta.getSaldo() >= transferencia )	 	
        }
    }
}
 
/*     System.out.println("Digite a chave aleatória:");
String chaveAleatoriaDig = scanner.nextLine();

boolean chaveASerValidada = validaAlea.validarChaveAleatoria(chaveAleatoriaDig);
if(chaveASerValidada == true) {
	
System.out.println("Chave aleeatória válida!");        	
	
	
} else {
	
System.out.println("Chave invalida!");	
	return;
}


System.out.println("Digite o cpf");
String cpfDigitado = scanner.nextLine();

boolean cpfASerValidado = validaroCpf.validar(cpfDigitado);
if (cpfASerValidado) {
	System.out.println("Cpf valido!");
	
} else {
	
	System.out.println("Cpf invalido!");
	return;
}

// Validação de Telefone
System.out.println("Digite o número do telefone no formato DDD+NUMERO:");
String numeroTelefone = scanner.nextLine();

// Chama o método para validar o telefone
boolean telefoneValido = validaTelefone.validaTelefone(numeroTelefone);
if (!telefoneValido) {
    System.out.println("Telefone inválido. O processo de PIX foi interrompido.");
    return; // Interrompe o processo se o telefone for inválido
}

// Validação de E-mail
System.out.println("Digite o e-mail:");
String email = scanner.nextLine();

// Chama o método para validar o e-mail
boolean emailValido = emailValidator.validarEmail(email);
if (!emailValido) {
    System.out.println("E-mail inválido. O processo de PIX foi interrompido.");
    return; // Interrompe o processo se o e-mail for inválido
}

// Se todas as validações forem bem-sucedidas, continua com o processo de PIX
System.out.println("Processo de PIX realizado com sucesso!");
*/       




