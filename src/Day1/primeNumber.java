package Day1;

import java.util.*;
import java.util.Map.Entry;

public class primeNumber {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		//to find 10 prime number
		int num=2;
		int i,j;
		for(j=0;j<15; )
		{
		for(i=2;i<num;i++)
		{
			if(num%i==0)
			{
				break;
			}
		}
		if(i==num)
		{
			j++;
			System.out.println("It's a prime number"+num);
		}
		num++;
		
		}
     
	
	//reverse String
	String str="Shreya";
	for(int k=str.length()-1;k>=0;k--)
	{
		System.out.print(str.charAt(k));
	}
	System.out.println();
	
	//or another method
	StringBuffer buffer=new StringBuffer("Shreya");
	StringBuffer k=buffer.reverse();
	System.out.println(k);
	
	
	//comparing the string
	String str1="Shreya";
	String str2="Shreya";
	System.out.println(str1.equals(str2));
	
	//another method
	if(true)
	{
		System.out.println("passed");
	}
	else
		System.out.println("failed");
	
	
	//gettin the number of words in string
	
	String str4="She is a nice girl";
	String []ni=str4.split(" ");
	System.out.println(ni.length);
	
	
	//getting each character from the string
	//char[]y=str4.toCharArray();
	String str5="She is a nice girl";
	for(int i3=0;i3<str5.length();i3++)
	{
		char ch=str5.charAt(i3);
		System.out.print(ch+" "); 
	}
	
	
	
	//collection
	HashMap<String,Integer>hs=new HashMap<String,Integer>();
	hs.put("A",1);
	hs.put("B",2);
	hs.put("C",3);
	hs.put("D",4);
	System.out.println(hs);
	for(Entry<String,Integer>e:hs.entrySet())
	{
		System.out.println(e.getKey()+" "+e.getValue());
	}
	
	
	//list
	List<Integer>li=new LinkedList<Integer>();
	li.add(55);
	li.add(2);
	li.add(8);
	li.add(45);
	for(Integer e:li)
	{
		System.out.println(e);
	}
	
	//linkedahaShMap
	
	Map<String,Integer>mp=new LinkedHashMap<>();
	mp.put("A",1);
	mp.put("B",2);
	mp.put("C",3);
	mp.put("D",14);
	
	for(Entry e:mp.entrySet())
	{
		System.out.println(e.getKey()+" "+e.getValue());
	}
	Iterator<Map.Entry<String, Integer>> it = mp.entrySet().iterator();
	while (it.hasNext()) 
	{
	    System.out.println(it.next());
	}

	
	
	
	
	
	}
}
