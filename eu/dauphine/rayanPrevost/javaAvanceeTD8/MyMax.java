package eu.dauphine.rayanPrevost.javaAvanceeTD8;

public class MyMax {

	//public static <E extends Comparable<E>> E MyMax(E first, E ...others) {
	public static <E extends Comparable <? super E>> E MyMax(E first, E ...others) {
		E max = first;
		for (E o: others) {
			if(o.compareTo(max)>0) {
				max = o;
			}
		}
		return max;
	}
}
