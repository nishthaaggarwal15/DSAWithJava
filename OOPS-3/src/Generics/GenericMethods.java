package Generics;

public class GenericMethods {
    public static <T> void printArray(T arr[]){
        for (int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer arr[]= new Integer[5];
        for(int i =0; i<arr.length; i++){
            arr[i]= i+1;
        }
        printArray(arr);
        String arrs[]= new String[5];
        for(int i =0; i<arrs.length; i++){
            arrs[i]= "abc";
        }
        printArray(arrs);
        Vehicle v[]= new Vehicle[5];
        for(int i =0; i<v.length; i++){
            v[i]= new Vehicle(); // every element of vehicle array will be pointing to vehicle object
        }
        printArray(v);
    }
}
