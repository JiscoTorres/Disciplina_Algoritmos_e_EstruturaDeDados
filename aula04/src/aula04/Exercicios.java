package aula04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Exercicios {
//1. 
	public static void main(String[] args) {
		//Crie um ArrayList
		ArrayList<String> dvds = new ArrayList<String>();
		
		//adicione alguns elementos a ele
		dvds.add("Titanic");
		dvds.add("Mulan");
		dvds.add("Hercules");
		dvds.add("Barbie");
		dvds.add("Karate Kid");
		
		//imprima o tamanho da lista
		System.out.println(dvds.size());
		
		
		//verifique se um elemento específico está presente na lista
		System.out.println(dvds.get(1));
		
		
//2.	
		//Crie um ArrayList
		ArrayList<String> cds = new ArrayList<String>();
		cds.add("Bagerz");
		cds.add("Sobrevivendo ao Inferno");
		cds.add("Alucinação");
		cds.add("Bagerz");
		
		
		//retorne o número de elementos únicos na lista.
		HashSet<String> unicos = new HashSet<>(cds);
        System.out.println("Elementos únicos: " + unicos.size());
		
        
//3. 
        //Crie  um ArrayList de números inteiros
        ArrayList<Integer> lista1 = new ArrayList<Integer>();
        
        lista1.add(23);
        lista1.add(17);
        lista1.add(13); // menor numero
        lista1.add(47);
        
        //retorne o índice do menor número na lista.
        int menor = Collections.min(lista1);
        System.out.println("Índice do menor número: " + lista1.indexOf(menor));
        
	}
}


/*
1. Crie um ArrayList e adicione alguns elementos a ele. Em seguida, imprima o tamanho da lista e verifique se um elemento específico está presente na lista.
2. Crie um ArrayList e retorne o número de elementos únicos na lista.
3. Crie  um ArrayList de números inteiros e retorne o índice do menor número na lista.
4. Crie  um ArrayList de strings e retorne o número de ocorrências de uma string específica na lista.
5. Crie  um ArrayList de números inteiros e remova todos os números pares da lista.
6. Crie  um ArrayList de String e ordene a lista em ordem alfabética.
7. Crie um ArrayList de strings e retorne um novo ArrayList que contenha apenas as strings que começam com uma letra específica.
8. Crie  um ArrayList de números inteiros e calcule a média dos números na lista.
9. Crie  um ArrayList de strings e retorne um novo ArrayList que contenha as strings na ordem reversa.

*/