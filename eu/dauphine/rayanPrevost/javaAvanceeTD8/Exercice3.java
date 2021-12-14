package eu.dauphine.rayanPrevost.javaAvanceeTD8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercice3 {

	public static List listLength(List list) {
		ArrayList length = new ArrayList();
		for (int i = 0; i < list.size(); i++) {
			CharSequence seq = (CharSequence)list.get(i);
			length.add(seq.length());
		}
		return length;
	}
	
	
	public static void main(String[] args) {
		List l = Arrays.asList("Colonel","test");
		System.out.println(listLength(l));
	}
	
	//Avec variable de type T
	public static <T extends CharSequence> List<Integer> listLength2(List<T> list){
		//Très important, il va le demander à l'EXAMEN les trucs sur les collections
		if(list.isEmpty()) {
			//Très importatnt !
			//return Collections.emptyList();
			return Collections.<Integer>emptyList();
		}
		ArrayList<Integer> length = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			CharSequence seq = (CharSequence)list.get(i);
			length.add(seq.length());
		}
		return length;
	}
	
	//Avec wildCard
	public static List<Integer> listLength3 (List<? extends CharSequence> list){
		return null;
		
	}

	
}
