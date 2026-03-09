package arrays.day3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayDemo4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] marks = null;
		
		try(sc){
			System.out.println("Enter the no of Subject");
			int subject = sc.nextInt();
			marks = new int[subject];
			
			//Initialize the Array
			for(int i=0;i<marks.length;i++) {
				System.out.println("Enter "+(i+1)+" subject marks: ");
				marks[i] = sc.nextInt();
			}
			//finding the total marks
			int total = 0;
			for(int mark :marks) {
				total += mark;
			}
			System.out.println("The total mark is "+total);
			System.out.println("arverage is "+(total/subject)+"%");
			
			
		}catch(ArrayIndexOutOfBoundsException aex) {
			System.out.println("Array Iout of index ");
		}catch(InputMismatchException iex) {
			System.out.println("Arrat input missmatch exception");
		}
	}
}
