package com.dev.Exercise;

public class ReverseArray {

	public static void main(String[] args) {
		int [] arr = {10,20,30,40};
		System.out.print("Orignal array : ");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("Array in reverse is : ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
	
	

}
