import java.util.Scanner;
public class Array1{
	public static void main(String[] args){
		int count=0,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numer of elements:");
		int n = sc.nextInt();
		System.out.println("Enter the elements:");
		int[] a = new int[20];
		for (int i = 0; i < n; i++) {
      			a[i] = sc.nextInt();
    		}
		for (int i = 2; i < n; i++) {
      			count = 0;
      			for (int j = 1; j <= i; j++) {
        			if (i % j == 0) {
          				count++;
        			}
      			}
      			if (count == 2) {
       			 sum = sum + a[i];
       			}
    		}
   		System.out.println(sum);

  	}
}