class trye
{
	public static void main(String args[]){
		int a[][] = { {1,2},{4,5}};

		for(int i=0;i<=1;i++){
			for(int j=0;j<=1;j++){
				System.out.print("\t"+a[i][j]);
			}
			System.out.println();
		}

		System.out.println();
		for(int i=0;i<=1;i++){
			for(int j=0;j<=1;j++){
				System.out.print("\t"+(a[i][j]+a[i][j]));
			}
			System.out.println();
		}
	}
}