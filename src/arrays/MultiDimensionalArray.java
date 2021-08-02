package arrays;

import java.util.Scanner;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	
//		int arr1[][]= {{3,4,5},{4,5,6}};
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number of rows");
		int rows=s.nextInt();
		System.out.println("enter the number of coloumns");
		int coloumns=s.nextInt();
		int arr[][]=new int[rows][coloumns];
		System.out.println("enter the elements in the array");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<coloumns;j++) {
				
				arr[i][j]=s.nextInt();
				
				
			}
			
			
		}
		
		int min=arr[0][0];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<coloumns;j++) {
				
				if(arr[i][j]<min) {
					min=arr[i][j];
				}
				
				
				
				
			}
			
			
			
		}
		System.out.println(min);
	}

}
