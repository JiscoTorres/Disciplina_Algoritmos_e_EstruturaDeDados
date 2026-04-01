package aula6;

import java.util.HashSet;

public class Principal {
	public static void main(String[] args) {
		HashSet<String> carros = new HashSet<String>();
		carros.add("Montana");
		carros.add("Space Fox");
	    carros.add("Fusca");
	    carros.add("Montana");
	    	System.out.println(carros);
	    
	    //    OBS: No Hash, não é possivel fazer get para pegar uma infromacao específica, logo não dá para usar o "carros.get()".
	     
	    	
	    
	    carros.remove("Fusca");
	    	System.out.println(carros);
	    
	    
	    	
	    	
	    for (String a : carros) {
	    	System.out.println(a);
	    }
	    
	    
	    
	    
	    
	}
}
