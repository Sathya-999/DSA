package com.tap.programming;
// the whole class is about the recurresion
public class Program96 {
	public static void main(String[] args) {
		int ar [] = {1,2,3,4,5};
		 System.out.println(Sort(ar, 0));
	}
//	printing the numbers from the 1 to n
	public static void PrintN(int n) {
		if(n == 0) {
			return;
		}
		PrintN(n-1);
		System.out.println(n);
	}
//	Printing the numbers from the n to 1
	public static void printN(int n) {
		if(n == 0) {
			return;
		}
		System.out.println(n);
		printN(n-1);
	}
//	finding sum of first N numbers
	public static int sumOf(int n) {
		if(n == 0) {
			return 0;
		}
		return sumOf(n-1)+n;
	}
//	counting the factorial of a given number suppose 5! = 120
	public static int fact(int n) {
		if(n == 0) {
			return 1;
		}
		return n*fact(n-1);
	}
//	printing even numbers from 1 to N
	public static void PrintEven(int n) {
		if (n == 0) {
			return;
		}
		PrintEven(n-1);
		if(n%2 == 0) {
			System.out.println(n);
		}
		
	}
//	mock test
	public static void printOdd(int n) {
		if(n == 0) {
			return;
		}
		printOdd(n-1);
		if(n%2 != 0) {
			System.out.println(n);
		}
	}
//	 printing the multiples of 3
	public static void printMul(int n) {
		if(n == 0) {
			return;
		}
		printMul(n-1);
		if(n%3 == 0) {
			System.out.print(n+" ");	
		}
	}
//	sum of squares
	public static int sumOfSquares(int n) {
	    if (n == 0) {
	        return 0;  
	    }
	    return (n * n) + sumOfSquares(n - 1);  
	}
//	lets check the traversing the array
	public static void traverseArray(int ar [],int i) {
		
		if(i==ar.length) {return;}
		System.out.print(ar[i]+" ");
		traverseArray(ar, i+1);
	}
//	now move to the sum problem
	public static int totalSum(int ar [],int i) {
		int sum = 0;
		if(i == ar.length) {
			return 0;
		}
		return ar[i] + totalSum(ar,i+1);
	}
//	find the max element
	public static int maxElement(int ar[], int i) {
	    if (i == ar.length - 1) {
	        return ar[i];
	    }
	    int res = maxElement(ar, i + 1);
	    return Math.max(ar[i], res);
	}
//	find the array sorted or not
	public static boolean Sort(int ar [],int i) {
		if(i == ar.length) {
			return false ;
		}
		if(ar[i] < ar[i+1]) {
			return true;
		}
		return Sort(ar,i+1);
		
		
	}


	
}
