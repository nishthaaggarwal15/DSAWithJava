import java.util.Scanner;

public class sumofarrays_recursive {
    public static int sum(int arr[]){
        if(arr.length == 0){
            return 0;
        }
        int[] newarr = new int[arr.length-1];
        for(int i =1; i<arr.length; i++){
            newarr[i-1]= arr[i];
        }
        int output = arr[0]+ sum(newarr);
        return output;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of array:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0; i<n; i++){
            System.out.println("enter the value of " + i + "index");
            arr[i]= sc.nextInt();
        }
        System.out.println("sum of array is:");
        System.out.println(sum(arr));
    }
}

