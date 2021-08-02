package arrays;

import java.util.Scanner;

public class MultiDimensionalArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mincoloumn=0;
		
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
					mincoloumn=j;
				}
				
				
				
				
			}
			
		
			
			
			
		}
		
		int max=arr[0][mincoloumn];
		int k=0;
		while(k<3) {
			if(max<arr[k][mincoloumn]) {
				max=arr[k][mincoloumn];
			}
			k++;
		}
		
		System.out.println(max);
	}


	}


