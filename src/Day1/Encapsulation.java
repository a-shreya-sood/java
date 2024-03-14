package Day1;

public class Encapsulation {

	public static void main(String[] args) 
	{
		trial obj=new trial();
		obj.setName("Shreya","Sood");
		System.out.println(obj.getName());
		
	}

}
class trial
{
	private String name;
	private String surName;
	public void setName(String name,String surName)
	{
		this.name=name;
		this.surName=surName;
	}
	
	public String getName()
	{
		return name;
	}
}
