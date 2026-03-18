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
        
        
        
        
        
        
        
        
        
        
        
//4.    
        //Crie  um ArrayList de strings e retorne o número de ocorrências de uma string específica na lista.
        ArrayList<String> nomes = new ArrayList<String>();
        
        nomes.add("Sylvester Stallone");
        nomes.add("Hannah Montana");
        nomes.add("Zumbi dos Palmares");
        nomes.add("Hannah Montana");
        nomes.add("Jennie Ruby Jane");
        nomes.add("Hannah Montana");
        
        
      //string que queremos contar
        String busca = "Hannah Montana";
        
        
      //contador
        int contador = 0;
        
        
        for (String nome : nomes) {
            if (nome.equals(busca)) {
                contador++;
            }
        }
        
        //Saída
        System.out.println("A string '" + busca + "' aparece " + contador + " vezes.");
        
       
        
        
        
        
        
        
        
        
        
//5.
        //Crie  um ArrayList de números inteiros e remova todos os números pares da lista.
        ArrayList<Integer> lista2 = new ArrayList<Integer>();
        
        lista2.add(10);
        lista2.add(25);
        lista2.add(30);
        lista2.add(45);
        lista2.add(50);
        lista2.add(65);
        
        
      //remove números pares
        lista2.removeIf(num -> num % 2 == 0);

        System.out.println(lista2);
     
        
        
        
        
        
        
        
        
        
        
       
 //6.
        //Crie  um ArrayList de String e ordene a lista em ordem alfabética.
        ArrayList<String> nomes2 = new ArrayList<String>();
        
        
        nomes2.add("Sylvester Stallone");
        nomes2.add("Michael B. Jordan");
        nomes2.add("Hannah Montana");
        nomes2.add("Zumbi dos Palmares");
        nomes2.add("Xuxa");
        nomes2.add("Jennie Ruby Jane");
        
        Collections.sort(nomes2); //Para ordenar as váriaveis
        
        System.out.println("Nomes em ordem Alfabética: " + nomes2);
        
        
        
        
        
        
        
        
        
        
        
//7. 
        //Crie um ArrayList de strings e retorne um novo ArrayList que contenha apenas as strings que começam com uma letra específica.
        ArrayList<String> list1 = new ArrayList<String>();
        
        
        list1.add("Sylvester Stallone");
        list1.add("Michael B. Jordan");
        list1.add("Hannah Montana");
        list1.add("Jubileu");
        list1.add("Zumbi dos Palmares");
        list1.add("João Gomes");
        list1.add("Jennie Ruby Jane");
        
        char letra = 'J';

      //nova lista
      ArrayList<String> filtrada = new ArrayList<String>();

      for (String nome : list1) {
          if (nome.startsWith(String.valueOf(letra))) {
              filtrada.add(nome);
          }
      }

      //Saída
      System.out.println("Nomes que começam com '" + letra + "': " + filtrada);
      
      
      
      
      
      
      
      
      
      
//8. 
      //Crie  um ArrayList de números inteiros e calcule a média dos números na lista.
      ArrayList<Integer> numeros8 = new ArrayList<Integer>();
      
      numeros8.add(10);
      numeros8.add(20);
      numeros8.add(30);
      numeros8.add(40);
      numeros8.add(50);
      

    //somar os valores
    int soma = 0;

    for (int num : numeros8) {
        soma += num;
    }

    //calcular a média
    double media = (double) soma / numeros8.size();

    //Saída
    System.out.println("Média: " + media);
    
    
    
    
    
    
    
    
    
    
    
//9.
    //Crie  um ArrayList de strings e retorne um novo ArrayList que contenha as strings na ordem reversa.
    ArrayList<String> lista9 = new ArrayList<String>();

    lista9.add("Ana");
    lista9.add("Bruno");
    lista9.add("Carlos");
    lista9.add("Daniel");

    //criando uma cópia
    ArrayList<String> reversa = new ArrayList<>(lista9);

    Collections.reverse(reversa);
    

    //Saída
    System.out.println("Lista original: " + lista9);
    System.out.println("Lista reversa: " + reversa);
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