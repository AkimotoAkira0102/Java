class Array2
{
		public static void main (String[] args)
		{
			int a[][] = {{1,2},{3,4}};
			System.out.println("==============a==============");
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					System.out.print(a[i][j] + "\t");
				}
				System.out.println();
			}
		}
}