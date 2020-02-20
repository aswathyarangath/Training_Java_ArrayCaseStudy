import java.util.Scanner;
import java.lang.Math;
class Array3{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n=s.nextInt();
		int sum=0;
		System.out.println("Enter the elements:");
		int arr[]=new int[20];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		for (int i = 0; i < n; i++) 
  		  { 
  
       		 // In case of even positioned element 
       		 if ((i + 1) % 2 == 0) {
           			 arr[i] = (int)Math.pow(arr[i], 2); 
			sum=sum+arr[i];
  		}
      		  // Odd positioned element 
       		 else{
        			   arr[i] = (int)Math.pow(arr[i], 3); 
				sum=sum+arr[i];
		    } 
		}	
		System.out.println("sum is : "+sum);
	}
}		