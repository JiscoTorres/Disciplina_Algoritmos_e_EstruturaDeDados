package aula6;

import java.util.HashSet;

public class Exercicios {
	public static void main(String[] args) {
		//1. Crie um HashSet vazio chamado "mySet".
		HashSet<Integer> mySet = new HashSet<Integer>();
		
		
		
		//2. Adicione os números 1, 2, 3, 4 e 5 ao HashSet "mySet".
		mySet.add(1);
		mySet.add(2);
		mySet.add(3);
		mySet.add(4);
		mySet.add(5);
			System.out.println(mySet);
		
		
		
		//3. Verifique se o HashSet "mySet" contém o número 3.
		System.out.println("Contém o número 3? " +  mySet.contains(3));
		
		
		
		
		//4. Remova o número 2 do HashSet "mySet".
		mySet.remove(2);
			System.out.println(mySet);
		
		
		
		
		//5. Verifique se o HashSet "mySet" está vazio.
		System.out.println("Está vazio? " + mySet.isEmpty());
		
		
		
		
		
		
		//6. Crie outro HashSet chamado "otherSet" e adicione os números 4, 5, 6 e 7.
		HashSet<Integer> otherSet = new HashSet<Integer>();
		otherSet.add(4);
		otherSet.add(5);
		otherSet.add(6);
		otherSet.add(7);
			System.out.println(otherSet);
		
			
			
			
			
		//7. Retenha no HashSet "mySet" apenas os elementos presentes em "otherSet".
		mySet.retainAll(otherSet);
	        System.out.println("mySet após retainAll: " + mySet); // [4, 5]
		
	        
	        
	        
	        
	        
	   //8. Adicione todos os elementos de "otherSet" ao HashSet "mySet".
	    mySet.addAll(otherSet);
	        System.out.println("mySet após addAll: " + mySet); // [4, 5, 6, 7]

	        
	        
	        
	        
	        
	    // 9. Obtenha o tamanho atual do HashSet "mySet".
	    System.out.println("Tamanho do mySet: " + mySet.size());

	    
	    
	    
	    
	    
	    // 10. Percorra todos os elementos do HashSet "mySet" e imprima cada um deles.
	    System.out.println("Elementos do mySet:");
	        for (Integer elemento : mySet) {
	            System.out.println(elemento);   
	    
	}
 }
}

/*

1. Crie um HashSet vazio chamado "mySet".
2. Adicione os números 1, 2, 3, 4 e 5 ao HashSet "mySet".
3. Verifique se o HashSet "mySet" contém o número 3.
4. Remova o número 2 do HashSet "mySet".
5. Verifique se o HashSet "mySet" está vazio.
6. Crie outro HashSet chamado "otherSet" e adicione os números 4, 5, 6 e 7.
7. Retenha no HashSet "mySet" apenas os elementos presentes em "otherSet".
8. Adicione todos os elementos de "otherSet" ao HashSet "mySet".
9. Obtenha o tamanho atual do HashSet "mySet".
10. Percorra todos os elementos do HashSet "mySet" e imprima cada um deles.



 */