package br.com.meebank;

public class ChaveAlatoria {

	
 public static boolean validarChaveAleatoria(String aleatoria){
	
String padronizacao = "^[a-zA-z0-9-]+$";	
		
	if (aleatoria.matches(padronizacao)) {
		
		return true;
				
	} else {
		
		System.out.println("Chave aleatoria invalida!");
		return false;
	}
 }
}


	
  
   

