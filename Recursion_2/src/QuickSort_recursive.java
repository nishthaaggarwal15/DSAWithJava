import java.util.Scanner;

public class QuickSort_recursive {
    public static int partition (int a[], int startIndex, int endIndex){
        int pivotElement = a[startIndex];
        int countSmallerElement= 0;
        for(int i = startIndex +1; i<=endIndex; i++){
            if(a[i]<pivotElement){
                countSmallerElement++;
            }
        }
        int pivotIndex = startIndex + countSmallerElement;
        int temp = a[startIndex+countSmallerElement];
        a[startIndex+countSmallerElement]=pivotElement;
        a[startIndex]=temp;
        int i=startIndex; int j=endIndex;
        while (i < pivotIndex && j > pivotIndex) {
            if (a[i] < pivotElement) {
                i++;
            } else if (a[j] > pivotElement) {
                j--;
            } else {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }

        return pivotIndex;
    }
    public static void quickSort(int a[], int startIndex, int endIndex){
        if(startIndex>=endIndex){
            return;
        }
        int pivotIndex = partition(a,startIndex, endIndex);
        quickSort(a,startIndex,pivotIndex-1);
        quickSort(a, pivotIndex+1, endIndex);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of array");
        int size= sc.nextInt();
        int a[]= new int[size];
        for(int i =0; i<size; i++){
            System.out.println("enter the value of " + i + " element");
            a[i]= sc.nextInt();

        }
        quickSort(a,0,size-1);
        System.out.println("Sorted Array is: ");
        for(int i: a){
            System.out.print(i + " ");
        }
    }
}
