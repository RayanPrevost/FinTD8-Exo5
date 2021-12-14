package eu.dauphine.rayanPrevost.javaAvanceeTD8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Exercice4 {

	
	public static <T> List<T> fusion(List<? extends T>list1, List<? extends T>list2){
		if(list1.size() != list2.size()) throw new IllegalArgumentException();
		if(list1.isEmpty() || list2.isEmpty()) return Collections.<T>emptyList();
		
		List<T> fusion = new ArrayList<>(); // Complexité O(n)
		//List<T> fusion = new LinkedList<>(); // Complexité n
		
		/*for (int i = 0; i < list1.size(); i++) {
			fusion.add(list1.get(i));
			fusion.add(list2.get(i));
		}*/
		
		//Amélioration aveec un interator car garantie que complexite O(n)
		Iterator<? extends T> iterator1 = list1.iterator();
		Iterator<? extends T> iterator2 = list2.iterator();
		
		while(iterator1.hasNext()) {
			fusion.add(iterator1.next());
			fusion.add(iterator2.next());
		}
		return fusion;
		
		
	}
}
