package com.tap.programming;

public class Program106 {
	public static void main(String[] args) {
		int ar [] = {20,15,10,17};
		int b = 7;
		int res = findWoodCount(ar,b);
		System.out.println(res);
	}
	public static int findWoodCount(int []ar,int b) {
		int max = ar[0];
		for(int i = 0 ;i<ar.length;i++) {
			if(ar[i] > max ) {
				max = ar[i];
			}
	}
		int low = 0 ,hg = max;
		while (low<=hg) {
			int mid = (low+hg)/2;
			int res = countWood(ar,mid);
			if(res == b || low == mid) {
				return mid;
			}
			else if(res > b) {
				low = mid;
			}else {hg = mid ;}
		}
		return -1;
}
//	Helper Function for couting how much wood generating.......
	public static int countWood(int [] ar,int mid) {
		int wc = 0;
		for(int i = 0;i<ar.length;i++) {
			if(ar[i]>mid) {
				wc += (ar[i] - mid);
			}
		}
		return wc;
	}
}
