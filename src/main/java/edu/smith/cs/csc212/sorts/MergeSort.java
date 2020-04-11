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
		throw new TODOErr();
	}
	
	/**
	 * Recursively sort this list by breaking it in half and piecing it back together.
	 * You will need to call {@linkplain #combineTwoSortedLists(ListADT, ListADT)}.
     *
	 * @param input - the input list.
	 * @return a new list containing the sorted output.
	 */
	public static ListADT<Integer> doMergeSortRecursively(ListADT<Integer> input) {
		throw new TODOErr();
	}
	
	/**
	 * Iteratively sort this list by breaking it in half and piecing it back together.
	 * You will need to call {@linkplain #combineTwoSortedLists(ListADT, ListADT)}.
	 * 
	 * @param input - the input list.
	 * @return a new list containing the sorted output.
	 */
	public static ListADT<Integer> doMergeSortIteratively(ListADT<Integer> input) {
		throw new TODOErr();
	}
}
