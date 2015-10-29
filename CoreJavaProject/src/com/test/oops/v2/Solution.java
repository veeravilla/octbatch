package com.test.oops.v2;

import java.util.*;

public class Solution {
	
	public static void main(String s[]){
	int a[]={8,4};
	int b[]={1,9,7,2,6,2,4};
	int result = 	solution(a,b);
	System.out.println("Result " + result);
	}
	
	public  static int solution(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;;
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0;
        for (int k = 0; k < n; k++) {
        	for(int j=0;j<m;j++){
                if (A[i] == B[j])
                    return A[i];
        	}
        }
        return -1;
    }
  /* public static  int solution(int M, int[] A) {
	   int N = A.length;
       int maxOccurence = 0;
       int index = 0;
       for (int i = 0; i < N; i++) {
    	   maxOccurence=0;
    	   for(int j=i;j<N;j++){
    		   if(A[i]==A[j]){
    			  ++maxOccurence; 
    		   }
    	   }
    	   if(maxOccurence >= M)
    		   return A[i];
       }
       return A[index];
    }*/
}
