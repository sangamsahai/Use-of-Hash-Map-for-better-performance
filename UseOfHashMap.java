/*This is an illustration of the amazing power of Hash Maps.
 * The problem statement - You are given a set of numbers(in an array) and a target number. 
You have to compute if any of the two numbers in that set add up to target or not
The brute force approach algorithm is of the order O(n*n)
But if we use Hash Map,the algorithm is of the order O(n) because adding anything to a Hash Map or retrieving  something 
from a Hash Map takes constant time* */


import java.util.HashMap;


public class UseOfHashMap {

	/**
	 * @param args
	 */

	public static int[] myArray=new int[]{1,2,4,5,7,9};// The array which contain the set of given numbers

	public static void computeResult(int target)//This is of the order O(n*n)
	{
		boolean hasTargetAsSum=false;
		for(int i=0;i<myArray.length;i++)
		{
			for(int j=0;j<myArray.length;j++)
			{
				if(i!=j)
				{
					if(myArray[i]+myArray[j]==target)
					{
						hasTargetAsSum=true;
					}
				}
			}

		}
		if(hasTargetAsSum==true)
			System.out.println("Yes !!");
		else
			System.out.println("No !!");

	}

	public static void computeResultUsingHaspMap(int target)//This is of the order O(n)
	{
		boolean hasTargetAsSum=false;
		HashMap<Integer,Integer> hashMap=new HashMap<Integer,Integer>();
		for(int j=0;j<myArray.length;j++)
		{
			int numberRequired=target-myArray[j];
			if(hashMap.containsKey(numberRequired)==true)
			{
				hasTargetAsSum=true;
				break;
			}
			else
			{
				hashMap.put(myArray[j],myArray[j]);
			}
		}
		if(hasTargetAsSum==true)
			System.out.println("Yes !!");
		else
			System.out.println("No !!");

	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		computeResult(3);
		computeResultUsingHaspMap(3);
	}

}
