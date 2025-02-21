package Exception_Handlinng;

import java.util.Scanner;

//public class Exceptions {
//    public  static  int divide (int a , int b) throws  DivideByZeroException // it pass on the exception to whoever has called this method
//     {
//        if(b==0){
//            throw  new DivideByZeroException(); // either we can handle the exception or pass it to who has called it
//            // this is will throw the exception in function it is called if we don't add throw to function's statement
////            throw new ArithmeticException();
//     }
//        return a/b;
//    }
//    public static void main(String[] args) throws DivideByZeroException // now main has also passed the exception,
//    // and we will see this error in the run time  also and after this exception nothing will run in the code
//            /// AND IF MAIN WANTS TO HANDLE THIS EXCEPTION WE'LL SEE THIS BELOW USING TRY AND CATCH BLOCK
//    {
//        Scanner sc = new Scanner(System.in);
//        int a= sc.nextInt();
//        int b =sc.nextInt();
//        divide(a,b);
//    }
//}
public class Exceptions {
    public  static  int divide (int a , int b) throws  DivideByZeroException // it pass on the exception to whoever has called this method
    {
        if(b==0){
            throw  new DivideByZeroException(); // either we can handle the exception or pass it to who has called it
            // this is will throw the exception in function it is called if we don't add throw to function's statement
//            throw new ArithmeticException();
        }
        return a/b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numerator");
        int a= sc.nextInt();
        System.out.println("Enter the denaminator");
        int b =sc.nextInt();
        try {
            divide(a,b);
        } catch (DivideByZeroException e){
            System.out.println("Denominator cannot be zero");
        }finally {
            System.out.println("Final execution");
        }
        System.out.println("Main");
    }
}
