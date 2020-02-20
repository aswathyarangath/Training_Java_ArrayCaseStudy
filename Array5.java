import java.util.*;
public class Array5{
	public static void main(String args[]){
		int[]a = {1,2,3,4,5};
     		 int[]b = {6,7,8,9,10};
		
		int[] c=new int[a.length+b.length];
		int j=0,k=0,l=0;
		int max=Math.max(a.length,b.length);
		for(int i=0;i<max;i++){
			if(j<a.length)		
				c[l++]=a[j++];
			if(k<b.length)
				c[l++]=b[k++];
		}
		System.out.println(Arrays.toString(c));
	}
}







