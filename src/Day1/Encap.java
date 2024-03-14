package Day1;

public class Encap {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stu
		tr1 obj=new tr1();
		obj.setName("shreya");
      System.out.println(obj.getName());
	}

}
class  tr1
{

private String name1;
public void setName(String name1)
{
	this.name1=name1;
}
public String getName()
{
	return name1;
}
}
