public class countdigits_recursive {
    public static int count( int n){
        if(n==0){
            return 0;
        }
        int small = count(n/10);
        int output = 1 + small;
        return output;
    }
    public static void main(String[] args) {
        System.out.println(count(4567));
    }
}
