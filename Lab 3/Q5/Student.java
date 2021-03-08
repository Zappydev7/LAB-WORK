package com.R177219070.Q5;
import java.util.*;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String grade;
		int arr[]=new int[10];
		System.out.println("Enter the value of marks of 10 students");
		for(int i=0;i<10;i++) {
			arr[i]=input.nextInt();
		}
		for(int i=0; i<10; i++)
		{
		for(int j=i+1; j<10; j++)
		{
		if(arr[j] <arr[i])
		{
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
		}

	    }
	}	
		for(int i=0;i<10;i++) {
			if(arr[i]>=40&&arr[i]<=50) {
			grade="PASS";
			System.out.println(arr[i]);
			System.out.println(grade);}
			else if(arr[i]>=51 && arr[i]<=75) {
			grade="MERIT";
			System.out.println(arr[i]);
			System.out.println(grade);
			}
			else if(arr[i]>75) {
			grade="DISTINCTION";
			System.out.println(arr[i]);
			System.out.println(grade);
			}
			else
			System.out.println("invalid output");
			

          }
		input.close();
	}
}
