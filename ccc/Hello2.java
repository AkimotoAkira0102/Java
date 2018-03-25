public class Hello2
{
	public static void main(String[] args)
	{
		System.out.println("Hello, World!");
		
		int x=3, y=5;
		int z = x+y, w= x*y;
		System.out.println("x=" + x + " y=" + y + " z=" + z + " z=" + z);
		
		float pi = 3.14f;
		double e = 2.71828;
		System.out.println("pi=" + pi + " e=" +e+ " pi/e=" + pi/e);
		
		//char *s= "Hello!";
		String s = "Hello!";
		char a = 'a';
		
		System.out.println(s+a+pi);
		
		int sum = 0, i;
		for(i=1;i<=100;i++)
		{
			if(i%2==1 || i%3==0)
			{
				sum += i;
			}
		}
		
		System.out.println("i=" + i + " sum=" + sum);
	}
}