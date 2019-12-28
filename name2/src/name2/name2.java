package name2;
import java.lang.Thread;
 
public class name2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]=new int[10];
        for(int i=0;i<a.length;i++){
        	a[i]=(int)(Math.random()*1000);
        	System.out.println("  "+a[i]);
        }
        System.out.println();
        int max=a[0];
        for(int j=0;j<a.length;j++){
        	if(a[j]>max){
        		max=a[j];
        	}
        	
        }
        System.out.println(max);
        
	}

}
