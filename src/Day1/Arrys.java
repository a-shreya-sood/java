package Day1;

import java.util.*;
import java.util.LinkedHashSet;
import java.util.Set;

public class Arrys {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int[] arr=new int[] {2,56,44,1,3,23};
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("largets el:"+max);
		
		
		int max1,max2;
		max1=max2=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max1)
			{
				max2=max1;
				max1=arr[i];
			}
			else if (arr[i]> max2)
			{
				max2=arr[i];
			}
		}
		System.out.println("second larget:"+max2);
		
		
		
		
		//String question
		String str="Shreyayaayay Soodidodo";
		
		Set<Character>hs=new LinkedHashSet<Character>();
		
		for(int i=0;i<str.length();i++)
		{
			hs.add(str.charAt(i));
			
		}
		
		
		for(Character c:hs)
		{
			System.out.print(c);
		}
       System.out.println();
		
		
		//Inserting an elemnet
		int[]arr1=new int[10] ;
		arr1[0]=2;
		arr1[1]=55;
		arr1[2]=43;
	   arr1[3]=9;
	   
	   for(int e:arr1)
	   {
		   System.out.println("earlier:"+e);
	   }
		
	   int n=4;
	   int ele=91;
	   int index=1;
	   for(int i=n;i>index;i--)
	   {
		   arr1[i]=arr1[i-1];
	   }
	   arr1[index]=ele;
	   
	   
	   for(int z:arr1)
	   {
		   System.out.println(z);
	   }
	   
	   
	   
	   //even and odd
	   int num=10;
	   if(num%2==0)
	   {
		   System.out.println("even");
		   
	   }
	   else
	   {
		   System.out.println("odd");
	   }
	   
	   
	   //prime number
	 int num1=2;
	 int i;
	for(num1=2;num1<=20;num1++)
	{
		for(i=2;i<num1;i++)
		{
			if(num1%i==0)
			{
				break;
			}
		}
		if(i==num1)
		{
			System.out.println(num1);
		}
	}
	
	int num3=10;
	int j;
	int count=0;
	for(j=2;j<num3;j++)
	{
		if(num3%j==0)
		{
			count++;
			break;
		}
	}
	if(j==num3)
	{
		System.out.println("prime");
	}
	else
	{
		
		System.out.println("compositive");
	}

	
	String strp="Your life your rule";
	char[]w=strp.toUpperCase().toCharArray();
	for(int i7=0;i7<w.length;i7++)
	{
		if(w[i7]=='A' || w[i7]=='E'|| w[i7]=='O'|| w[i7]=='U' || w[i7]=='I')
		{ 
		  System.out.println("The vowels are:"+" "+w[i7]+" "+"at index"+" "+i7);
		}
	}
	
	//getting largest and smallest value
	int brr[]=new int[] {20,3,66,2,90,1};
	Arrays.sort(brr);
	for(int e:brr)
	{
		System.out.println("After sorting elements are:"+e);
	}
	int cr=brr[brr.length-1];
	int br=brr[brr.length-2];
	System.out.println("Largest element:"+" "+cr+" "+"Second largest element:"+" "+br);
	
	
	
	//fibonace series
	int n1=0;
	int n2=1;
	int n3;
	int count1=12;
	System.out.print(n1+" "+n2);
	for(int ic=2;ic<count1;ic++) 
	{
		n3=n1+n2;
		n1=n2;
		n2=n3;
	System.out.print(" "+n3);
	}
	System.out.println();
	
	//swapping 2 number using third number
	int x=10;
	int y=20;
	x=x+y;
    y=x-y;
    x=x-y;
    System.out.println(x+" "+y);
    
    
   

}
}
