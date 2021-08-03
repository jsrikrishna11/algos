package week1;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * SD2x Homework #1
 * Implement the methods below according to the specification in the assignment description.
 * Please be sure not to change the signature of any of the methods!
 */

public class LinkedListUtils {

	private static int indexFirstMax(LinkedList<Integer> list, int value){
		Iterator<Integer> itr = list.iterator();
		int index = 0;
		while(itr.hasNext() && itr.next() < value){
			index++;
		}
		return index;
	}
	public static void insertSorted(LinkedList<Integer> list, int value) {
		if (list == null){
			return;
		}
		int index = indexFirstMax(list, value);
		list.add(index, value);
	}

	private static boolean removeAllElements(LinkedList<String> list, String t){
		int initialLength = list.size();
		while(list.contains(t)){
			list.remove(t);
		}

		return initialLength > list.size();
	}
	private static String findMax(LinkedList<String> list){

		String max = new String();
		for(String element : list){
			if(element.compareTo(max)>0){
				max = element;
			}
		}
		return max;
	}
	public static void removeMaximumValues(LinkedList<String> list, int N) {

		if(list==null || N < 0){
			return;
		}
		/* IMPLEMENT THIS METHOD! */
		/*
		* [z,q,d,s,b,a,z,q,q,s] - 2
		* removes s and z
		* */

		while(N>0 ){
			String removeString = findMax(list);
			if(removeAllElements(list, removeString)){
				N--;
			}
			else{
				break;
			}
		}
	}

	public static boolean containsSubsequence(LinkedList<Integer> one, LinkedList<Integer> two) {
		if(one == null || two == null){
			return false;
		}
		/* IMPLEMENT THIS METHOD! */
		int sizeOne = one.size();
		int sizeTwo = two.size();
		int subStr = 0;
		try {
		for (int i = 0; i < sizeOne; i ++){
			if(one.get(i) == two.get(subStr)){
				for (subStr = 1; subStr < sizeTwo; subStr++){

						if (one.get(i + subStr) != two.get(subStr)) {
							break;
						}

				}
				if (subStr == sizeTwo){
					return true;
				}
				subStr = 0;
			}
		}
		}catch (IndexOutOfBoundsException e){
			return false;
		}
		return false; // this line is here only so this code will compile if you don't modify it
	}
}
