package stack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

class Solution {
	static int  MissingNumber(int array[], int n) {
        // Your Code Here
        if(array.length==0)
            return 0;
       
        int sumA=0,sum=0;
        
        for(int i=0;i<array.length;i++) {
        	sumA+=array[i];
        }
        
        for(int i=1;i<=n;i++) {
        	sum+=i;
        }
        
        return sum-sumA;
    }
	
	static int majorityElement(int a[], int size)
    {
        
		 int count = 0;
	     Integer candidate = null;

        for (int num : a) {
            if (count == 0) {
                candidate = num;
            }
           
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    
    }
    
	static ArrayList<Integer> leaders(int arr[], int n){

		ArrayList<Integer> list = new ArrayList<Integer>();
		int max=arr[arr.length-1];
		list.add(max);
		
		for(int i=arr.length-2;i>=0;i--) {
			if(max<arr[i]) {
				max=arr[i];
				list.add(max);
			}
		}
		
		int i=0,j=list.size()-1;

		while(i<=j) {
			int temp=list.get(i);
			list.set(i, list.get(j));
			list.set(j,temp);
			i++;j--;
		}
		
		System.out.println(list);
		return list;
    }
	
	public static int equilibriumPoint(long arr[], int n) {

		if(arr.length==0)
			return -1;
		if(arr.length==1)
			return (int)arr[0];
		
		int sum=0;
		int leftSum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		
		for(int i=0;i<arr.length;i++) {
			sum-=arr[i];
			
			if(sum==leftSum)
				return i+1;
			
			leftSum+=arr[i];
		}
		return -1;
    }
	
	static int binarysearch(int arr[], int n, int k){

		int low=0,high=arr.length-1;
		int mid=0;
		
		while(low<=high) {
			mid=low+(high-low)/2;
			
			if(arr[mid]==k)
				return mid;
			else if(arr[mid]>k) {
				high--;
			}else if(arr[mid]<k) {
				low++;
			}
		}
		
		return -1;
	}
	
	static String removeDups(String S) {

		StringBuilder out = new StringBuilder();
		S=S.toLowerCase();
		for(int i=0;i<S.length();i++) {
			String ch =  S.substring(i,i+1);
			if(out.indexOf(ch)<0)
				out.append(ch);
		}
		System.out.println(out);
		return out.toString();
    }
	
	static int repeatedSubtraction(int A,int B){
        
        int count=0;
        
        while(true){
        	int min = Math.min(A,B);
        	
        	if(A==0 || B==0)
        		break;
        	if(A>min)
        		A=A-min;
        	else if(B>min)
        		B=B-min;
        	else
        		A=A-min;
            count++;
        }
        
        return count;
    }

	public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,
            int x) {

			int count=0;
			HashSet<Integer> set = new HashSet<Integer>();
			
			for(int i=0;i<head1.size();i++) {
				set.add(head1.get(i));
			}
			
			for(int i=0;i<head2.size();i++) {
				int num=x-head2.get(i);
				if(set.contains(num))
					count++;
			}
			System.out.println(count);
			return count;
		}
	
    public static void main(String[] args) {
		int[] arr = {1};
		System.out.println(MissingNumber(arr,2));
		int[] a = {6,1 ,15, 19, 9, 13, 12, 6, 7, 2, 10, 4, 1, 14, 11, 14, 14, 13};
		System.out.println(majorityElement(a,18));
		int[] b = {63,70,80,33,33,47,20};
		leaders(b,7);
		long[] A = {1,3,5,2,2};
		System.out.println(equilibriumPoint(A,7));
		
		int[] arr1 = {1,2, 3, 4, 5} ;
		binarysearch(arr1,5,4);
		removeDups("geeksforGeeks");
		repeatedSubtraction(5,13);
		
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.add(1);list1.add(2);list1.add(3);list1.add(4);list1.add(5);list1.add(6);
		
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list2.add(11);list2.add(12);list2.add(13);
		
		countPairs(list1,list2,15);
		
		StringBuilder s = new StringBuilder("4312211");
		StringBuilder orig = s;
		
		System.out.println(orig);
		System.out.println(s.reverse());
		
		System.out.println(orig.equals(s.reverse()));
		
		
	}
}