package br.com.meebank;

public class ChaveAlatoria {

	
 public static boolean validarChaveAleatoria(String aleatoria){
	
String padronizacao = "^[a-zA-z0-9-]+$";	
		
if(aleatoria.length() <=36 & aleatoria.length() >= 32) {	
	
	System.out.println("foi" + aleatoria);
	

	if (aleatoria.matches(padronizacao) ) {
		

	}
	System.out.println(aleatoria.length());
		return true;
			
	}  else{
		
		System.out.println("Chave aleatoria invalida!");
		return false;
	}
 }
}


	
  
   

