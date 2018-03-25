public class Hello{
	public static void main(String[] args){
		System.out.println("Hello World!");
		
		int x=3, y=5;
		int z = x+y,w=x*y;
		System.out.println("x=" +x+ " y=" +y+ " z=" +z+ " w=" +w);
		
		float pi = 3.14f;
		double e = 2.71828;
		System.out.println("pi=" +pi+ " e=" +e+ " pi/e=" +pi/e);
		
		//char *s = "Hello!";
		String s = "Hello!";
		char a = 'a';
		
		System.out.println(s+a+pi);
		
	}
}