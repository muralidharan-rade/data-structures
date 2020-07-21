package com.murrade.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 	
 * You have been given an array A of size N . you need to sort this array non-decreasing oder using bubble sort. 
 * However, you do not need to print the sorted array . 
 * You just need to print the number of swaps required to sort this array using bubble sort
 * 
 * Input Format:
 * The first line consists of a single integer N denoting size of the array. 
 * The next line contains N space separated integers denoting the elements of the array.
 * 
 * Output Format:
 * Print the required answer in a single line
 */

public class BubbleSort {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(reader.readLine());
		int[] rawArray = new int[n];

		String[] input = reader.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			rawArray[i] = Integer.parseInt(input[i]);
		}

		int swaps = bubbleSort(rawArray);
		System.out.println(swaps);
	}

	private static int bubbleSort(int[] rawArray) {
		int swaps = 0;
		int temp;

		for (int k = 0; k < rawArray.length; k++) {
			for (int i = 0; i < rawArray.length - k - 1; i++) {
				if (rawArray[i] > rawArray[i + 1]) {
					temp = rawArray[i];
					rawArray[i] = rawArray[i + 1];
					rawArray[i + 1] = temp;
					swaps++;
				}
			}
		}

		return swaps;
	}

}
