package Day1;

import java.util.Scanner;

public class OneDArray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int A[]= {1,2,3,4,5};
		int B[]= {34,4,5,7,9};
		System.out.println(B.length);
		A[2]=6;
		int i;
		for(i=0;i<A.length;i++)
		{
			System.out.println(A[i]);
		}
		
		//incremented value
		
		//++A[]here ++ is pre increment and the value will be increased before printing
		for(i=0;i<A.length;i++)
		{
			System.out.println("Incremented value:"+(++A[i]));
		}
		
		
		//Finding sum of elements in an array
		//First Method for traversing array
		int []t= {3,9,7,8,12,6,15,5,4,10};
		int sum=0;
		int j;
		for(j=0;j<t.length;j++)
		{
			sum=sum+t[j];
		}
		System.out.println("sum is:"+sum);

		//searching an element in array
		
//		Scanner sc=new Scanner(System.in);
//		int key;
//		System.out.println("Enter the key");
//		key=sc.nextInt();
//		for(j=0;j<t.length;j++)
//		{
//			if(key==A[j])
//			{
//				System.out.println(j);
//				System.exit(0);
//				//break;
//			}
//		}
//		System.out.println("Not found");
		
	
	//Finding maximun element in the array
	int []p= {3,9,7,8,12,6,15,5,4,10};
	int max = p[0];
	for(int q=0;q<p.length;q++)
	{
		if(p[q] > max)
		{
			max=p[q];
	    }
     }
	System.out.println("The maximum value is:"+max);
	
	
	
	//Finding second largest number
	int []b= {3,9,7,8,12,6,15,5,4,10};
	int max1,max2;
	 max1=max2=b[0];
	 for(int i1=0;i1<b.length;i1++)
	 {
		 if(b[i1]>max1)
		 {
			 max2=max1;
			 max1=b[i1];
		 }
//		 else if(b[i1]>max2)
//		 {
//			 max2=b[i1];
//		 }
	 }
	System.out.println("Second largest element:"+max2);
	System.out.println("First largest element:"+max1);
	
	
	
	
	//ROTATIon of ARRAY
	int []arr= {3,9,7,8,12,6,15,5,4,10};
	int temp;
	for(int r:arr)
	{
		System.out.println(r+" ");
	}
	temp=arr[0];
	for(int y=0;y<arr.length-1;y++)
	{
		 arr[y] = arr[y+1];
		
	}
	System.out.println();
	arr[arr.length-1]=temp;
	for(int r:arr)
	{
		System.out.print(r+" ");
	}
	
	
	System.out.println("done");
	
	
	//INSERTING AN ELEMENT
	int w[]=new int[10];
	w[0]=1;
	w[1]=18;
	w[2]=23;
	w[3]=15;
	w[4]=77;
	w[5]=9;
	w[6]=22;
	for(int y:w)
	{
		System.out.print(y+" ");
	}
	System.out.println();
	int index=2;
	int n=6;
	int x=990;
	int i2;
	for(i2=n;i2>index;i2--)
	{
		w[i2]=w[i2-1];
	}
	w[index]=x;
	for(int s:w)
	{
		System.out.print(s+" ");
	}
	
	
	
	//DELETING AN ELEMENT
	int w1[]=new int[10];
	w1[0]=1;
	w1[1]=18;
	w1[2]=23;
	w1[3]=15;
	w1[4]=77;
	w1[5]=9;
	w1[6]=22;
	for(int u:w1)
	{
		System.out.print(u+" ");
	}
	System.out.println(); 
	int in=1;
	int len=5;
	int temp2=in;
	for(int i3=in;i3<len;i3++)
	{
		w[i3]=w[i3+1];
	}
	for(int k:w1)
	{
		System.out.print(k+" ");
	}
		
}
}
