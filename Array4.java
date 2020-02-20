import java.util.*;
class Array4{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n=s.nextInt();
		int sum=0;
		System.out.println("Enter the elements:");
		int a[]=new int[20];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++){
			if((i+1)%2!=0){
				a[i]=a[i]*i;
				sum=sum+a[i];
			
			}
			

		}
	System.out.println("sum is : "+sum);
	}
}
			