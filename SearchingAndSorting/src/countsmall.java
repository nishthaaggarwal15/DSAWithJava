/*
roblem statement
You are given two arrays of integers. Let's call the first array A and the second array B. A finds the number of elements in array B that are smaller than or equal to that element for every array element.



Constraints :
1  <= T <= 10
1  <= N,M <= 10000
-1e9 <= A[i], B[i] <= 1e9
Time Limit: 1 sec
Example:
Input:
A = [0, 2, 3]
B = [1, 5]


Output:
[0,1,1]

Explanation:

For the first index, A[0] = 0
In array B no numbers are less than 0. Therefore the answer for the first index is 0.

For the second index, A[1] = 2
In array B only 1 is less than 2. Therefore the answer for the second index is also 1.

For the third index, A[2] = 3
Only 1 element is less than 3 Therefore the answer for the third index is 1

Hence, the final answer is [0,1,1] in this case.
Constraints :
1  <= T <= 10
1  <= N,M <= 10000
-1e9 <= A[i], B[i] <= 1e9
Time Limit: 1 sec
Example:
Input:
A = [0, 2, 3]
B = [1, 5]


Output:
[0,1,1]

Explanation:

For the first index, A[0] = 0
In array B no numbers are less than 0. Therefore the answer for the first index is 0.

For the second index, A[1] = 2
In array B only 1 is less than 2. Therefore the answer for the second index is also 1.

For the third index, A[2] = 3
Only 1 element is less than 3 Therefore the answer for the third index is 1

Hence, the final answer is [0,1,1] in this case.
Input Format:
The first line of input contains an integer ‘T’ denoting the number of test cases.
Then the test case follows.

The first line of each test case contains an integer ‘N’ denoting the number of elements in the array A.

The second line of each test case contains ‘N’ space-separated integers denoting the elements of array A.

The third line of each test case contains an integer ‘M’ denoting the number of elements in array B.

The second line of each test case contains ‘M' space-separated integers denoting the elements of array B.
Output format:
For each test case, print N space-separated integers represent the number of elements in array B that are smaller than the corresponding element in array A.
Sample Input 1:
2
3
0 2 3
2
1 5
2
2 4
3
1 3 5
Sample Output 1:
0 0 1
1 2
 */

public class countsmall {
    public static int[] findCountArray(int n, int m, int []a, int []b) {
        // Write your code here.in
        int c[]= new int[n];
        for(int i =0; i<n; i++){
            int low=0; int high =m-1; int count =0;
            while(low<=high){
                int mid = low+(high-low)/2;
                if(b[mid]<= a[i]){
                    low = mid+1;
                    count = mid+1;
                }
                else {
                    high = mid -1;
                }
            }
            c[i]= count;
        }
        return c;
    }
    public static void main(String[] args) {
        int[] a = {5, 10, 2};
        int[] b = {1, 2, 3, 4, 5};
        int n = a.length;
        int m = b.length;

        int[] result = findCountArray(n,m,a,b);

        System.out.println("result is:");
        for(int i : result){
            System.out.print(i+ " ");
        }
    }
}
