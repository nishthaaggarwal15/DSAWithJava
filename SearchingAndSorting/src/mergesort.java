import java.util.Scanner;

public class mergesort {
    public static void sort(int a[], int b[]){
        int n = a.length;
        int m = b.length;
        int p = n+m;
        int c[] = new int[p];
        int i=0; int j=0; int k=0;
        while(i<n && j<m){
            if(a[i]<b[j]){
                c[k]= a[i];
                i++;
                k++;
            } else {
                c[k]= b[j];
                j++;
                k++;
            }
        }
        while(i<n){
            c[k]= a[i];
            i++;
            k++;
        }
        while (j<m){
            c[k]= b[j];
            j++;
            k++;
        }
        for(int f:c){
            System.out.print(f+" ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the capacity of first array");
        int cap1= sc.nextInt();
        int a[] = new  int[cap1];
        System.out.println("enter the capacity of second array");
        int cap2= sc.nextInt();
        int b[] = new int[cap2];
        for(int i =0; i<cap1; i++){
            System.out.println("enter the value of " + i + " index of first array");
            a[i]= sc.nextInt();
        }
        for(int i =0; i<cap2; i++){
            System.out.println("enter the value of " + i + " index of second array");
            b[i]= sc.nextInt();
        }
        System.out.println("New merged array is:");
        sort(a,b);
    }
}
