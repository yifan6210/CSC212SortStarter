package edu.smith.cs.csc212.sorts;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import me.jjfoley.adt.ListADT;
import me.jjfoley.adt.impl.JavaList;


public class MergeSortTest {
	
	@Test
	public void testCombineSortedLists() {
		ListADT<Integer> left = new JavaList<>();
		left.addBack(2);
		left.addBack(4);
		ListADT<Integer> right = new JavaList<>();
		right.addBack(1);
		right.addBack(3);
		right.addBack(5);
		
		ListADT<Integer> expected = new JavaList<>();
		expected.addBack(1);
		expected.addBack(2);
		expected.addBack(3);
		expected.addBack(4);
		expected.addBack(5);

		assertEquals(expected, MergeSort.combineTwoSortedLists(left, right));
	}
	
	@Test
	public void testCombineSortedListsLong() {
		ListADT<Integer> left = new JavaList<>();
		for (int item : Arrays.asList(1,3,5,7,9,90,92)) {
			left.addBack(item);
		}
		ListADT<Integer> right = new JavaList<>();
		for (int item : Arrays.asList(2,4,6,7,8,9,11)) {
			right.addBack(item);
		}
		
		ListADT<Integer> expected = new JavaList<>(Arrays.asList(1,2,3,4,5,6,7,7,8,9,9,11,90,92));		
		
		Assert.assertEquals(expected, MergeSort.combineTwoSortedLists(left, right));				
	}
	
	@Test
	public void testMergeSortRec() {
		ListADT<Integer> start = new JavaList<>();
		for (int x : new int[] {8,6,7,5,7,3,0,9}) {
			start.addBack(x);
		}
		ListADT<Integer> expected = new JavaList<>();
		for (int x : new int[] {0,3,5,6,7,7,8,9}) {
			expected.addBack(x);
		}
		ListADT<Integer> actual = MergeSort.doMergeSortRecursively(start);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testMergeSortIter() {
		ListADT<Integer> start = new JavaList<>();
		for (int x : new int[] {8,6,7,5,7,3,0,9}) {
			start.addBack(x);
		}
		ListADT<Integer> expected = new JavaList<>();
		for (int x : new int[] {0,3,5,6,7,7,8,9}) {
			expected.addBack(x);
		}
		ListADT<Integer> actual = MergeSort.doMergeSortIteratively(start);
		assertEquals(expected, actual);
	}
	
	
}
