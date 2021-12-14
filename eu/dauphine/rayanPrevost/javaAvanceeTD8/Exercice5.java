package eu.dauphine.rayanPrevost.javaAvanceeTD8;

import java.util.ArrayList;
import java.util.List;

public class Exercice5 {

	public static <E> void swap(List<E> l , int int1, int int2) {
		E temp = l.get(int1);
		l.set(int1,l.get(int2));
		l.set( int2,temp);
		
	}
	
	// Non, il n'est pas possible de le parametrer avec un Wildcat
	
	public static int randomInt(int lower, int upper) {
		return (int) (Math.random() * (upper - lower)) + lower;
	}
	
	public static <E> List randomShuffle(List<E> list) {
		
		List updateList = list;
		
		for (int i = 0; i < list.size(); i++) {
			int randomNumber1  = randomInt(0,list.size());
			int randomNumber2  = randomInt(0,list.size());
			
			swap(list,randomNumber1,randomNumber2);
		}
		
		return updateList;
	}
	
	public static <E> List randomShuffleBis(List<E> list) {
		
		List updateList = list;
		for (Object element : list) {
			int randomInt = randomInt(0,list.size());
			int randomInt2 = randomInt(0,list.size());
			swap(list,randomInt,randomInt2);
			
		}
		
		return updateList;
	}
	
	// Non, il n'est pas possible de le parametrer avec un Wildcat
	// La complexite avec ArrayList est de O(1) en accès
	// La complexite avec LinkedList est de O(N) en accès. Comme on utilise le .get(i) dans la methode swap, si on utilise une LinkedList la complexité devient O(n^2) 

	// Je pense qu'on pourrait faire mieux, peut être en utilisant un tableau ?
	// Au lieux d'une boucle for pour quoi ne pas utiliser une bouvle foreach ? 
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		List<String> list2 = new ArrayList<String>();
		list2.add("Toto");
		list2.add("Titi");
		list2.add("Tutu");
		list2.add("Tata");
		
		
		System.out.println((randomShuffle(list)));
		System.out.println((randomShuffleBis(list)));
		
		
		System.out.println((randomShuffleBis(list2)));
		System.out.println((randomShuffle(list2)));
		
	}
}
