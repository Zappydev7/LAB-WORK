package com.R177219070.Q1;

public class Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]input = {1,3,2};
		for(int i = 0;i<3;i++)
		{
			for(int j= 0;j<3;j++)
			{
				for(int k= 0;k<3;k++)
				{
					if(i!=j && j!=k && k!= i)
					{
						System.out.println(input[i]+" "+input[j]+" "+input[k]);
					}
				}
			}
		}

	}

}
