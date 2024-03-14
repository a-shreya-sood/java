package Day1;

import java.util.Arrays;

public class Factorial {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
     int num=5;
     int f=1;
     int i;
//    while(num>=i)
//     {
//    	 f=f*i;
//    	 i++;
//     }
     
     //code for factorial
    for(i=num;num>0;i--)
    {
    	f=f*i;
    	num--;
    }
     System.out.println(f);
		

//code for prime number
		int num1=13;
		int count=0;
		for(int i1=2;i1<num1;i1++)
		{
			for(int j=2;j<i1;j++)
			{
			if(i1%j!=0)
			{
				count++;
				System.out.println("prime number "+i1);
				break;
			}
		}
		}
		if(count!=0)
		{
			System.out.println("Composit Number");}
	
			else
			
				System.out.println("prime number");
			
		
		String str="Sgreya sood yjshf";
		for(int o=str.length()-1;o>=0;o--)
		{
			System.out.println(str.charAt(o));
		}
		
		
		//reverse in string
		StringBuilder buffer= new StringBuilder("Shreya sood");
		System.out.println(buffer.reverse());
		
		String str4="Sgreya Sood NaMe";
		String name="";
		char[]w =str4.toCharArray();
		
		for(int u=w.length-1;u>=0;u--)
		{
			name=name+w[u];

		}
		System.out.println(name);
		
		//code for upper and lower letter
		//String str4="Sgreya Sood NaMe";
		int countupper=0;
		int countlower=0;
		for(int u=0;u<w.length;u++)
		{
			if(w[u]>='A'&& w[u]<='Z')
			{
				countupper++;
				System.out.print(w[u]);
			}
			else if(w[u]>='a'&& w[u]<='z')
			{
				countlower++;
			}
		}
		System.out.println("ll:"+countupper);
		System.out.println(countlower);
		
		
		
		//split the string 
		String name2="hgegjdj hfurfhe";
		String[] rt=name2.split(" ");
		System.out.println(rt.length);
		//System.out.println(rt);
		for(String p:rt)
		{
			System.out.println(p);
		}
	
		
		//swapping without third number
		int x=10;
		int y=20;
		x=x+y;
	   y=x-y;
	   x=x-y;
	   System.out.println(x+" "+y);
	   
	   
	   //getting largest number from array
	   int []arr= new int[]{23,7,56,90,2};
	   Arrays.sort(arr);
	   //System.out.println(arr);
	   for(int k=0;k<arr.length;k++)
	   {
		   System.out.println(arr[k]);
	   }
	   //System.out.println(arr.length);
	   
	   int max=arr[0];
	   for(int q=0;q<arr.length;q++)
	   {
		   if(arr[q]>max)
		   {
			   max=arr[q];
		   }
	   }
		   System.out.println("largest element:"+max);
		   
		   
		   
		   //smallest number from array
		   int max1,max2;
		  max1=max2=arr[0];
		  for(int g=0;g<arr.length;g++)
		  {
			  if(arr[g]>max1)
			  {
				  max2=max1;
				  max1=arr[g];
			  }
		  }
		  System.out.println("First element:"+max1);
		  System.out.println("Second element:"+max2);
		  
		  
		  
		  //searching element in array
		  int []a=new int[] {3,65,7,33};
		  for(int b=0;b<a.length;b++)
		  {
			  if(a[b]==3)
			  {
				  System.out.println("yes");
				  break; 
			  }
		  }
		  
		  
	}
		
	
}
