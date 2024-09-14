import java.util.Scanner;
/*Problem statement
Given an integer n, using phone keypad find out all the possible strings that can be made using digits of input n.

Return empty string for numbers 0 and 1.

Note :
1. The order of strings are not important.
2. Input and output has already been managed for you. You just have to populate the output array and return the count of elements populated in the output array.*/
public class ReturnKeypad_Strings_recursive {
    public static String[] SingleDigit(int n){
        if(n==0|| n==1){
            String [] output = {""};
            return output;
        }
        if(n==2){
            String [] output = {"a","b","c"};
            return output;
        }
        if(n==3){
            String [] output = {"d","e","f"};
            return output;
        }
        if(n==4){
            String [] output = {"g","h","i"};
            return output;
        }
        if(n==5){
            String [] output = {"j","k","l"};
            return output;
        }
        if(n==6){
            String [] output = {"m","n","o"};
            return output;
        }
        if(n==7){
            String [] output = {"p","q","r", "s"};
            return output;
        }
        if(n==8){
            String [] output = {"t","u","v"};
            return output;
        }
        else{
            String[] output = {"w","x","y","z"};
            return output;
        }
    }
    public static String[] keypad(int n){
        if (n==0||n==1){
            String output[]= {""};
            return output;
        }
        //recursive call
        String SmallAns [] = keypad(n/10);// a b c
        String SingleDigitOutput[]= SingleDigit(n%10); // d e f
        String doubleSize[]= new  String[SmallAns.length* SingleDigitOutput.length]; // 3*3
        int k = 0;
        for(int i =0; i<SmallAns.length; i++){
for(int j =0; j< SingleDigitOutput.length; j++){
    doubleSize[k]=  SmallAns[i]+SingleDigitOutput[j];
    k++;
}
        }
return  doubleSize;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        String[] output = keypad(input);

        for (String str : output) {
            System.out.println(str);
        }

    }
}

