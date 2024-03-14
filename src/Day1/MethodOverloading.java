package Day1;

public class MethodOverloading
{
	public static void main(String[] args) 
	{
		overLoad obj=new overLoad();
		obj.c1(10,"Shreya");
		obj.c2("Sood",2);
		
		
		overRide obj1=new overRide();
		obj1.c3("Sanachi","sood",24);
	}
}

class overLoad
{
	public void c1(int i,String k)
	{
	    	System.out.println(i+k);
	}
	
	public void c2(String j,int y)
	{
		System.out.println(j+y);
	}
	
	
	public void c3(String name,String lName,int age)
	{
		System.out.println("Let's sseee:"+name+lName+age);
	}
	
}

class overRide extends overLoad
{

	public void c3(String name,String lName,int age)
	{
		System.out.println("This is ok:"+name+lName+age);
	}
	
}


