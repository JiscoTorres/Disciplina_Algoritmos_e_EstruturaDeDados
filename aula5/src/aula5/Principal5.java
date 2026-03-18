package aula5;

import java.util.HashMap;

public class Principal5 {
	public static void main(String[] args) {
		HashMap<Integer, String> Pessoa = new HashMap<Integer, String>();
		
		Pessoa.put(12334545, "João");
	    Pessoa.put(8765433, "Francisco");
	    Pessoa.put(3456789, "Torres");
	    Pessoa.put(4765445, "Molina");
	    
	    
	    System.out.println(Pessoa);//irá retornar todos os valores
	    
	    System.out.println(Pessoa.get(8765433));//Vai retornar só Francisco
	    
	    
	    //Alteração de valor
	    Pessoa.put(8765433, "Chico");
	    System.out.println(Pessoa);
	    
	    
	    
	    //Removendo um valor
	    Pessoa.remove(8765433);
	    System.out.println(Pessoa);
	    

	    

}
}