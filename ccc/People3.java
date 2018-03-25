class People3
{
	public static void main(String[] args)
	{
		String target = "二毛";
		if(args.length>0) target = args[0];
		String[] name = {"大毛","二毛","三毛"};
		String[] tel = {"3333","2222","1111"};
		for(int i=0;i<3;i++)
		{
			if(target.equals("") || name[i].equals(target))
				System.out.println(name[i] + ":" + tel[i]);
		}
	}
}