package br.com.meebank;

import java.util.Scanner;

public class Pix {

    private ValidaTelefone validaTelefone; // Instância da classe de validação de telefone
    private ValidaEmail emailValidator; // Instância da classe de validação de e-mail
    private ValidaCpf validaroCpf;

    // Construtor para inicializar as classes de validação
    public Pix() {
        this.validaTelefone = new ValidaTelefone();
        this.emailValidator = new ValidaEmail();
        this.validaroCpf = new ValidaCpf();
    }

    // Método para realizar validação de telefone, e-mail e CPF
    public void realizarPix() {
        Scanner scanner = new Scanner(System.in);
        
        // Validação de CPF
        System.out.println("Digite o CPF para a realização do PIX: ");
        String cpfPix = scanner.nextLine();
        
        try {
            boolean cpfValidado = validaroCpf.validaCPF(cpfPix); 
            if (!cpfValidado) {
                System.out.println("CPF inválido. O processo de PIX foi interrompido.");
                return; // Interrompe o processo se o CPF for inválido
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao validar o CPF: " + e.getMessage());
            return; // Interrompe o processo se ocorrer um erro durante a validação do CPF
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
