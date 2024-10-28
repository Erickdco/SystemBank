package br.com.meebank;

import java.util.Scanner;

public class Pix {

    private ValidaTelefone validaTelefone; // Instância da classe de validação de telefone
    private ValidaEmail emailValidator; // Instância da classe de validação de e-mail
    private ValidaCpf validaroCpf;
    private ChaveAlatoria validaAlea;

    // Construtor para inicializar as classes de validação
    public Pix() {
        this.validaTelefone = new ValidaTelefone();
        this.emailValidator = new ValidaEmail();
        this.validaroCpf = new ValidaCpf();
        this.validaAlea = new ChaveAlatoria();
    }

    // Método para realizar validação de telefone, e-mail e CPF
    public void realizarPix() {
        Scanner scanner = new Scanner(System.in);
               
        System.out.println("Digite a chave aleatória:");
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
    }
}
