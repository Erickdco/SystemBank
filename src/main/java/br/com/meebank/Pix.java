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
       System.out.println("Selcione o tipo de chave pix:");
       System.out.println("Cpf, email, numero, aleatoria");
       
       
       
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
    	  System.out.println("Digite o número de telefone:");
    	  String numeroAserDigitado = escrito.nextLine();
    	  
    	// Chama o método para validar o telefone
    	  boolean telefoneValido = validaTelefone.validaTelefone(numeroAserDigitado);
    	  if (telefoneValido) {
    	      System.out.println("Telefone valido");
    	      
    	      System.out.println("Seu saldo atual é de:" + saldoAtual);
           	
           	System.out.println("Digite o valor da transferencia:");
           	double transfer = escrito.nextDouble();
           	 
           	if(conta.getSaldo()>= transfer ) {
           	double novoSaldo = saldoAtual - transfer; 
           		System.out.println("transferência concluída com sucesso!");
           		System.out.println("O seu saldo atual é de:" + novoSaldo);
           		break;
           	} else {
           		System.out.println("Saldo insuficiente para realizar essa transferência!");
           		System.out.println("O seu saldo é de:" + saldoAtual);
           		break;
           	}
    	     
    	  } else {
    		  
    		  System.out.println("chave telefonica invalida!");
    		  break;
    	  }
    	  
      case "email":
    	  
    	  System.out.println("Digite o e-mail:");
    	  String email = escrito.nextLine();

    	  // Chama o método para validar o e-mail
    	  boolean emailValido = emailValidator.validarEmail(email);
    	  if (emailValido) {
    	      System.out.println("E-mail valido.");
    	      
    	      System.out.println("Seu saldo atual é de:" + saldoAtual);
             	
             	System.out.println("Digite o valor da transferencia:");
             	double transfer = escrito.nextDouble();
             	 
             	if(conta.getSaldo()>= transfer ) {
             	double novoSaldo = saldoAtual - transfer; 
             		System.out.println("transferência concluída com sucesso!");
             		System.out.println("O seu saldo atual é de:" + novoSaldo);
             		break;
             	} else {
             		System.out.println("Saldo insuficiente para realizar essa transferência!");
             		System.out.println("O seu saldo é de:" + saldoAtual);
             		break;
             	}
    	  }  else {
    		  
    		  System.out.println("chave email invalida!");
    		  break;	  
    	  }
    	  
    	  
      case "aleatoria":	
     
    	  System.out.println("Digite a chave aleatória:");
    	  String chaveAleatoriaDig = escrito.nextLine();

    	  boolean chaveASerValidada = validaAlea.validarChaveAleatoria(chaveAleatoriaDig);
    	  if(chaveASerValidada == true) {
    	  	
    	  System.out.println("Chave aleatória válida!");        	
    	  	
    	  System.out.println("Seu saldo atual é de:" + saldoAtual);
       	
       	System.out.println("Digite o valor da transferencia:");
       	double transfer = escrito.nextDouble();
       	 
       	if(conta.getSaldo()>= transfer ) {
       	double novoSaldo = saldoAtual - transfer; 
       		System.out.println("transferência concluída com sucesso!");
       		System.out.println("O seu saldo atual é de:" + novoSaldo);
       		break;
       	} else {
       		System.out.println("Saldo insuficiente para realizar essa transferência!");
       		System.out.println("O seu saldo é de:" + saldoAtual);
       		break;
       	}
    	  	
    	  } else {
    	  	
    	  System.out.println("Chave invalida!");	
    	  	return;
    	  } 
             		
        	
       default:
        	System.out.println("Opcão inválida!");
        	
        	System.out.println("Selecione uma opção valida!");
        	
        }
    }
}


