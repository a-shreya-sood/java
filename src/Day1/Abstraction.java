package Day1;

public class Abstraction {

	public static void main(String[] args) 
	{
		un obj=new ty();
		obj.nice("name");

	}

}
abstract class un
{
	abstract void nice(String i);
	
}

class ty extends un
{
  void nice(String i)	
 {
	 System.out.println("It's a goood day"+" "+i );
 }
}



