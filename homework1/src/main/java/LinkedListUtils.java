import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/*
 * SD2x Homework #1
 * Implement the methods below according to the specification in the assignment description.
 * Please be sure not to change the signature of any of the methods!
 */

public class LinkedListUtils {
	
	public static void insertSorted(LinkedList<Integer> list, int value) {

		/* IMPLEMENT THIS METHOD! */
		if (list != null){
			for (int i = 0; i <=list.size(); i++){
				if (list.isEmpty()){
					list.add(value);
					break;
				}
				if (value <= list.get(i)){
					list.add(i, value);
					break;
				}
				else if (value > list.getLast()){
					list.add(value);
					break;
				}
			}
		}
	}
	public static void removeMaximumValues(LinkedList<String> list, int N) {

		/* IMPLEMENT THIS METHOD! */
        if (list != null && N >=0 ){
			if (list.size() == 1){
				list.remove();
			}
			for (int i = 0; i <= list.size()-1; i++){
				if (list.get(i).compareTo(list.get(i+1)) < 0 || list.get(i+1).compareTo(list.get(i)) < 0) {
					if (list.get(i).compareTo(list.get(i+1)) >= N || list.get(i+1).compareTo(list.get(i)) > N) {
						list.remove();
					}
				}
			}
		}
	}
	
	public static boolean containsSubsequence(LinkedList<Integer> one, LinkedList<Integer> two) {

		/* IMPLEMENT THIS METHOD! */
		
		return true; // this line is here only so this code will compile if you don't modify it
	}
}
