package arrays;

import java.util.Scanner;

public class MultiDimensionalArray4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int maxcoloumn=0;
				
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
				
				int max=0;
				for(int i=0;i<rows;i++) {
					for(int j=0;j<coloumns;j++) {
						
						if(arr[i][j]>max) {
							max=arr[i][j];
							maxcoloumn=j;
						}
						
						
						
						
					}
					
				
					
					
					
				}
				System.out.println(maxcoloumn + "" + max);
				
				int min=arr[0][maxcoloumn];
				int k=0;
				while(k<rows) {
					if(arr[k][maxcoloumn]<min) {
						min=arr[k][maxcoloumn];
					}
					k++;
				}
				
				System.out.println(min);
			}


			




	

}


