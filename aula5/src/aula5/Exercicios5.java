package aula5;

import java.util.HashMap;

public class Exercicios5 {
	public static void main(String[] args) {
		
//1.
		//Crie um HashMap vazio chamado "myMap".
		HashMap<String, String> myMap = new HashMap<String, String>();
		System.out.println(myMap); // para gerar automaticamente um "System.out.println();" digitar syso + ctrl + espaço + enter
		

//2.
		//Adicione uma chave "nome" e um valor "João" ao HashMap "myMap".
		myMap.put("nome", "João");
		System.out.println(myMap); // para gerar automaticamente um "System.out.println();" digitar syso + ctrl + espaço + enter
		
		
//3.
		//Verifique se o HashMap "myMap" contém a chave "nome".
		System.out.println("Contém 'nome'? " + myMap.containsKey("nome"));

		
//4.
		//Adicione mais três pares chave-valor ao HashMap "myMap".
		myMap.put("idade", "21");
		myMap.put("CPF", "7654345");
		myMap.put("email", "joao@gmail.com");
		System.out.println(myMap);
		
		
//5.
		//Obtenha o valor associado à chave "idade" do HashMap "myMap".
		myMap.get("idade");
		System.out.println(myMap.get("idade"));
		
//6.
		//Remova a chave "nome" do HashMap "myMap".
		myMap.remove("nome");
		System.out.println(myMap);
		
		
//7.
		//Verifique se o HashMap "myMap" está vazio.
		System.out.println("Está vazio? " + myMap.isEmpty());
		
//8.
		//Obtenha o tamanho atual do HashMap "myMap".
		System.out.println("Qual o tamanho atual do HashMap? " + myMap.size()); // irá aparecer 3 porque eu removi o nome!
		
		
		
//9.
		//Percorra todas as chaves do HashMap "myMap" e imprima cada uma delas.
		 System.out.println("Chaves:");
	        for (String chave : myMap.keySet()) {
	            System.out.println(chave);
	        }
	        
	        
	        
//10.
	     //Percorra todos os valores do HashMap "myMap" e imprima cada um deles.
	        System.out.println("Chaves e Valores:");
	        for (String chave : myMap.keySet()) {
	            System.out.println("key: " + chave + " value: " + myMap.get(chave));
	        }
	        
	        
}
}


/*
1. Crie um HashMap vazio chamado "myMap".
2. Adicione uma chave "nome" e um valor "João" ao HashMap "myMap".
3. Verifique se o HashMap "myMap" contém a chave "nome".
4. Adicione mais três pares chave-valor ao HashMap "myMap".
5. Obtenha o valor associado à chave "idade" do HashMap "myMap".
6. Remova a chave "nome" do HashMap "myMap".
7. Verifique se o HashMap "myMap" está vazio.
8. Obtenha o tamanho atual do HashMap "myMap".
9. Percorra todas as chaves do HashMap "myMap" e imprima cada uma delas.
10. Percorra todos os valores do HashMap "myMap" e imprima cada um deles.

 */