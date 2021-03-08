package com.R177219070.Q2;

import java.util.*;
public class Squaresum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner input=new Scanner(System.in);
		int arr[]=new int[10];
		System.out.println("Enter 10 numbers");
		for(int i=0;i<10;i++) {
		arr[i]=input.nextInt();
		arr[i]*=arr[i];
		sum+=arr[i];}
		System.out.println(sum);
		input.close();
	}
}

	