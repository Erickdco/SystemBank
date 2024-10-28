package br.com.meebank;

import br.com.caelum.stella.validation.CPFValidator;

public class ValidaCpf {


 String cpf;	
	
public  ValidaCpf(Pix pix) {
	
this.cpf = cpf;	
	
}


public  ValidaCpf() {
	//Construtor padrão
	
}

 boolean  validar(String cpf) {
	
	CPFValidator validarCPF = new CPFValidator();
		
	try {
		
	validarCPF.assertValid(cpf);	
		
	System.out.println("Cpf valido!");
	return true;
	} catch (Exception e) {
		
    System.out.println("Cpf invalido!" + e.getMessage());
    return false;
	}
	}
	
}


