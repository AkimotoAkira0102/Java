class Matrix1
{
	public static void main(String[] args)
	{
		int A[][] = {{1,2},{3,4}};
		int B[][] = {{5,6},{7,8}};
		int C[][] = new int[2][2];
		for(int i=0;i<C.length;i++)
		{
			for(int j=0;j<C[0].length;j++)
			{
				int sum=0;
				for(int k=0;k<2;k++)
				{
					sum += A[i][k]*B[k][j];
				}
				C[i][j] = sum;
			}
		}
		for(int i=0;i<C.length;i++)
		{
			for(int j=0;j<C.length;j++)
			{
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}
	}
}