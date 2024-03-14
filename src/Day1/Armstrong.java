package Day1;

public class Armstrong {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int num=153;
		int temp=num;
		int sum=0;
        int r;
		while(num>0)
		{
			r=num%10;
			sum=sum+r*r*r;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("arsmtrong"+" "+sum);
		}
		else
		{
			System.out.println("Not armstrong");
		}
	}

}
