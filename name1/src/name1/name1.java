package name1;

public class name1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SIZE=4;
	      int mat[][]=new int[SIZE][SIZE];
	      int i,j,k=0,n,m;
	      n=SIZE;
	      m=(n+1)/2;
	      for(i=0;i<m;i++)
	      {
	         for(j=i;j<=n-i-1;j++)   //���ߣ������ң��в����б�
	             mat[i][j]=++k;      //���1��2��3��4��13��14
	         for(j=i+1;j<=n-i-1;j++)  //�ұߣ����ϵ��£��б��в���
	             mat[j][n-i-1]=++k;   //���5��6��7��15
	         for(j=n-i-2;j>=i;j--)    //�ױߣ����ҵ����в����б�
	             mat[n-i-1][j]=++k;     //���8��9��10��16
	         for(j=n-i-2;j>=i+1;j--)  //��ߣ����µ��ϣ��б��в���
	             mat[j][i]=++k;        //���11��12
	      }
	      for(i=0;i<n;i++)         //�����ά����
	      {
	          for(j=0;j<n;j++)
	             System.out.print(mat[i][j]+" ");
	          System.out.println();
	}

}
}
