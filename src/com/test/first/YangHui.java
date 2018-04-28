package com.test.first;

public class YangHui {

	public static void main(String[] args) {
		int arr[][]= new int[10][10];
		for (int i = 0; i < arr.length; i++) {
			for(int j=0;j<=i;j++) {
				if(i==j||j==0) {
					arr[i][j]=1;
				}else {
					arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
				}
			}
		}
		for (int i = 0; i <arr.length; i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
