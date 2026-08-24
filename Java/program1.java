import java.util.*;
public class program1{
    public static void main(String args []){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the size of array");
            int n = scan.nextInt();
            if (n <= 0) {
                System.out.println("Array size must be greater than zero");
                return;
            }
            int[] ar = new int[n];
            System.out.println("Enter the elements of the array");
            for(int i=0;i<n;i++){
                ar[i] = scan.nextInt();
            }
            System.out.println("Before rtion of the array");
            for(int i=0;i<n;i++){
                System.out.print(ar[i]+" ");
            }
            System.out.println();
            System.out.println("Enter the number of positions to rotate");
            int k = scan.nextInt();
            rotate(ar,k);
            System.out.println("After rotation of the array");
            for(int i=0;i<n;i++){
                System.out.print(ar[i]+" ");
            }
        }
        
    }
    // we are going to rotate the array by n times
    public static void rotate(int ar [],int k){
        int n = ar.length;
        k  = k%n;
        if(k<0){
            k = k+n;
        }
        reverse(ar,0,n-1);
        reverse(ar,0,k-1);
        reverse(ar,k,n-1);
    }
    // writing the helper function
    public static void reverse(int ar[],int start,int end){
        while(start<end){
            int temp = ar[start];
            ar[start] = ar[end];
            ar[end] = temp;
            start++;
            end--;
        }
    }
}