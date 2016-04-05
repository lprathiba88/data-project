/**
 *   File Name: Display.java<br>
 *
 *   Siebenthal, Madina<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 4, 2016
 *
 */

package com.sqa.ms.util.helpers;

/**
 * Display //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Siebenthal, Madina
 * @version 1.0.0
 * @since 1.0
 *
 */
public class Display {
	// Method should display 2 dimensional array nicely formatted on screen
	public static void display2DArray(int[][] matrix) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < matrix.length; i++) {
			stringBuilder.append("----------");
		}
		System.out.println(stringBuilder);
		for (int i = 0; i < matrix.length; i++) {
			displayArray(matrix[i]);
		}
		System.out.println(stringBuilder);
	}

	// Method should display array nicely formatted on screen
	public static void displayArray(int[] array) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("|\t");
		for (int i = 0; i < array.length; i++) {
			stringBuilder.append(array[i]);
			if (i < array.length - 1) {
				stringBuilder.append("\t");
			}
		}
		stringBuilder.append("\t|\n");
		System.out.print(stringBuilder);
	}

}
// public class Display {
// // Method should display 2 dimensional array nicely formatted on screen
// public static void display2DArray(int[][] matrix) {
// StringBuilder stringBuilder = new StringBuilder();
// stringBuilder.append("|\t");
// for (int i = 0; i < matrix.length; i++) {
//
// }
//
// for (int i = 0; i < matrix.length; i++) {
// stringBuilder.append(matrix[i]);
// if (i < matrix.length - 1) {
// stringBuilder.append("\t|");
// }
//
// }
// stringBuilder.append("\n");
// System.out.print(stringBuilder);
// }
//
//
// }
//
// // Method should display array nicely formatted on screen
// public static void displayArray(int[] array) {
// for (int i = 0; i < array.length; i++) {
// displayArray(array[i]);
//
// }
//
// }
