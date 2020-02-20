import java.util.*;
class Array2{
	public static void main(String args[]){
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n=s.nextInt();
		
		
		int a[]=new int[9];
		int b[]=new int[9];
		System.out.println("Enter the elements of first array:");
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		System.out.println("Enter the elements of second array:");
		for(int j=0;j<n;j++){
			b[j]=s.nextInt();
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(a[i]==b[j]){
					count++;
					
				}
			}
		}
		System.out.println("The number of repeated elements : "+count);
		}
}