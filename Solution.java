package practise;

import java.util.*;


public class Solution {
	static int search(int arr[], int N, int X) {
        int l = 0;
        int R = N - 1;
        Arrays.sort(arr);

        while (l <= R) {
            int mid = (l + R) / 2;
            if (arr[mid] == X) {
                return mid;
            } else if (arr[mid] > X) {
                R = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1; // Return -1 if the element is not found
    }
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		int X=sc.nextInt();
		search(arr,N,X);
	}
}
