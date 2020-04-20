package edu.smith.cs.csc212.sorts;

import me.jjfoley.adt.ListADT;
import me.jjfoley.adt.errors.TODOErr;
import me.jjfoley.adt.impl.JavaList;

public class MergeSort {

	/**
	 * This method walks through two sorted input lists and creates an output list that contains all elements from the two inputs.
	 * @param lhs - a sorted list.
	 * @param rhs  - a sorted list.
	 * @return a sorted list containing all of the items from lhs and rhs.
	 */
	public static ListADT<Integer> combineTwoSortedLists(ListADT<Integer> lhs, ListADT<Integer> rhs) {
		ListADT<Integer> output = new JavaList<>();

		while (lhs.size() != 0 && rhs.size() != 0) {
			if (lhs.getFront() <= rhs.getFront()) {
				output.addBack(lhs.removeFront());			
			} else {
				output.addBack(rhs.removeFront());
			}
		} 

		for (int i : lhs) {
			output.addBack(i);
		}
		for (int i : rhs) {
			output.addBack(i);
		}
		return output;

	}
	
	/**
	 * Recursively sort this list by breaking it in half and piecing it back together.
	 * You will need to call {@linkplain #combineTwoSortedLists(ListADT, ListADT)}.
     *
	 * @param input - the input list.
	 * @return a new list containing the sorted output.
	 */
	public static ListADT<Integer> doMergeSortRecursively(ListADT<Integer> input) {
		if (input.size() <= 1) {
			return input;
		} else {
			int middle = (0 + input.size())/2;
			ListADT<Integer> left = input.slice(0,middle);
			ListADT<Integer> right = input.slice(middle, input.size());
			return combineTwoSortedLists(doMergeSortRecursively(left), doMergeSortRecursively(right));
		}

	} 

	
	/**
	 * Iteratively sort this list by breaking it in half and piecing it back together.
	 * You will need to call {@linkplain #combineTwoSortedLists(ListADT, ListADT)}.
	 * 
	 * @param input - the input list.
	 * @return a new list containing the sorted output.
	 */
	public static ListADT<Integer> doMergeSortIteratively(ListADT<Integer> input) {
		ListADT<ListADT<Integer>> work = new JavaList<>();
		ListADT<Integer> output = new JavaList<>();
		
		for (int i:input) {
			ListADT<Integer> single = new JavaList<>();
			single.addBack(i);
			work.addBack(single);			
		}
		
		while (work.size() > 1) {
			work.addBack(combineTwoSortedLists(work.removeFront(),work.removeFront()));		
		}
		for (ListADT<Integer> i : work) {
			for (int n : i) {
				output.addBack(n);
			}
		}
		return output;
		
	} 
}
