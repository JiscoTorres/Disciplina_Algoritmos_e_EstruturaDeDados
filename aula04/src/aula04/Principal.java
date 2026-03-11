package aula04;

import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		//IMPORTANTE!!!   -> para criar o ArrayList<E>, digitar ArrayLis + ctrl + espaço, para não perder a configuração do comando!
		//1.
		ArrayList<String> carros = new ArrayList<String>();
		
		//2.
		carros.add("Pulse"); //Pulse será o valor 0 da variável carros
		carros.add("Honda Fit");//HOnda Fit será o valor 1 da variável carros
		carros.add("Defender");// Defender será o valor de endereço 2 da variável carros
		carros.add("Opala");//Opala será o valor de endereço 3 da variável carros
		carros.add("BYD");//BYD será o valor de endereço 4 da variável carros
		System.out.println(carros);
		//[Pulse, Honda Fit, Defender, Opala, BYD]
		
		
		//3.
		carros.remove(2); //Irá remover o valor do endereço 2 e assim, o valor do endereço 3 tomará o o endereço 2
		System.out.println(carros);
		//[Pulse, Honda Fit, Opala, BYD]
		
		
		//4
		carros.remove("BYD");
		System.out.println(carros);
		//[Pulse, Honda Fit, Opala]
		
		
		//5.
		System.out.println(carros.get(1)); //Acessando uma informação específica
		//Honda Fit
		
		
		//6.
		carros.set(0, "Pulse Abarth"); //Atualizando uma informação
		System.out.println(carros);
		//[Pulse Abarth, Honda Fit, Opala]
		
		
		//7.
		for(String carro : carros) { //para atribuir que cada valor de endereço da variável "carros" é na verdade cada um sendo um carro unitário 
			System.out.println(carro);
			//Pulse Abarth
			//Honda Fit
			//Opala

	}
}
}
