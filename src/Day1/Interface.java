package Day1;

public class Interface {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		normal obj=new normal();
		obj.cry();
		obj.run();
	}

}
interface showable
{
	static void run()
	{
		
	};
}
interface printable extends showable
{
	abstract void cry();
	
}
class normal implements printable
{

	@Override
	public void cry() {
		System.out.println("ok girls");
		
	}
	
	void run()
	{
		System.out.println("Don't shout");
	}
	
	
}
