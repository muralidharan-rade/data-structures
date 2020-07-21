package com.murrade.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiDimensionalArray {

	/*
	 * Given a 2D array A, your task is to convert all rows to columns and columns
	 * to rows.
	 * 
	 * Input: First line contains 2 space separated integers, N - total rows, M -
	 * total columns. Each of the next N lines will contain M space separated
	 * integers.
	 * 
	 * Output: Print M lines each containing N space separated integers.
	 */

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String dimensionsStr = br.readLine();
		String[] arr = dimensionsStr.split(" ");

		int rows = Integer.parseInt(arr[0]);
		int columns = Integer.parseInt(arr[1]);

		int[][] intArray = new int[rows][columns];

		for (int i = 0; i < rows; i++) {
			String[] rowStr = br.readLine().split(" ");
			for (int j = 0; j < columns; j++) {
				intArray[i][j] = Integer.parseInt(rowStr[j]);
			}
		}

		for (int i = 0; i < columns; i++) {
			for (int j = 0; j < rows; j++) {
				System.out.print(intArray[j][i] + " ");
			}
			System.out.println();
		}
	}

}
