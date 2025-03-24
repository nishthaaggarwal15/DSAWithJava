package Generics;

public class GenericMethods {
//    public static <T extends Vehicle> void printArray(T arr[]){ // will only recieve classes that extends vehicle
//        for (int i =0; i<arr.length; i++){
//            arr[i].print();
////            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
public static <T extends PrintInterface> void printArray(T arr[]){ // we exteneded print interface because when any class extends print
    // interface it'll have print method by defualt and
    // when we create an array of that class object we caen print that array by that implemented methpd
    for (int i =0; i<arr.length; i++){
        arr[i].print();
//            System.out.print(arr[i]+" ");
    }
    System.out.println();
}
    public static void main(String[] args) {
//        Integer arr[]= new Integer[5];
//        for(int i =0; i<arr.length; i++){
//            arr[i]= i+1;
//        }
//        printArray(arr);
//        String arrs[]= new String[5];
//        for(int i =0; i<arrs.length; i++){
//            arrs[i]= "abc";
//        }
//        printArray(arrs);


        Vehicle v[]= new Vehicle[5];
        for(int i =0; i<v.length; i++){
//            v[i]= new Vehicle(); // every element of vehicle array will be pointing to vehicle object
            v[i]= new Vehicle(10*i, "ab");
        }
        printArray(v);
        Student s []= new Student[5];
        for(int i =0; i<s.length; i++){
            s[i]= new Student(1+i);
        }
        printArray(s);
    }
}
