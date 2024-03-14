package Day1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TryString {

	public static void main(String[] args) 
	{
		
		//removing duplicate character from string
     String str="Shreya Sood Kashyap";
     System.out.println(str.split(" ").length);
     
     String str1 = "JavaTpoint is the best learning website";   
     String str2="Shrrreeeeeyaa Soodddd";

     Set<Character>hs=new LinkedHashSet<Character>();
     for(int d=0;d<str2.length();d++)
     {
     hs.add(str2.charAt(d));
     }
     
     for(Character v:hs)
     {
    	 System.out.print(v);
     }
     System.out.println();
	

   int arr5[]= {2,44,12,89,5,2};
   for(int g=0;g<arr5.length;g++)
   {
	   for(int h=g+1;h<arr5.length;h++)
	   {
		   if(arr5[g]==arr5[h])
		   {
			   System.out.println(arr5[g]);
		   }
	   }
	   
   }
	   String str8="Shreya Sood";
       for(int i=str8.length()-1;i>=0;i--)
       {
           System.out.print(str8.charAt(i));
       }
       System.out.println();
       
       int arr1[]= {3,77,2,566,4};
       int max1,max2;
       max1=max2=arr1[0];
       for(int j=0;j<arr1.length-1;j++)
       {
    	   if(arr1[j]>max1)
    	   {
    		   max2=max1;
    		 max1=arr1[j];  
    	   }
       }
       System.out.println(max1);
       System.out.println(max2);
   
	
	String k="okay okay";
	System.out.println(k.split(" ").length);
	
	
	int num=10;
	int i;
	for(i=2;i<num;i++)
	{
		if(num%i==0)
		{
			break;
		}
	}
	if(i==num)
	{
	System.out.println("prime");	
	}
	else
		System.out.println("not prime");	
		
   
	
	
	
	
	
	//first 10 prime number
	int  num1=2;
	int i1,j;
	for(j=0;j<10;)
	{ 
		for(i1=2;i1<num1;i1++)
		{
			if(num1%i1==0)
			{
				break;
			}
		}
	
		if(i1==num1)
		{
			j++;
			System.out.println("prime number:"+num1);
		}
		num1++;
	}
	
	
	String p="Shreyayayay soododod";
	Set<Character>s=new LinkedHashSet<Character>();
	for(int g=0;g<p.length();g++)
	{
		s.add(p.charAt(g));
	}
	
	for(Character y:s)
	{
		System.out.println(y);
	}
	
	
	
	int nu=1634;
	int temp=nu;
	int t,r;
	int sum=0;
	while(nu>0)
	{
		r=nu%10;
		sum=sum+r*r*r;
		nu=nu/10;
	}
	if(temp==sum)
	{
	System.out.println(sum);
	
	}
	else
	{
		System.out.println("failed");
	}
	
	
	
	}
	
}
