package com.R177219070.Q4;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 40 ;i<250;i++)
		{ if(i%5 == 0)
		{
			System.out.println(i);
			sum+= i;
		}

	  }
		System.out.println("sum is"+" "+sum);

	}
}