public class MergeSort_recursive {
    public static void merge(int s1[], int s2[], int s[]){
        int i =0;
        int j =0;
        int k=0;
        while (i<s1.length && j<s2.length){
            if(s1[i]<=s2[j]){
                s[k++]=s1[i++];

            } else{
                s[k++]= s2[j++];
            }
        }
            while(i<s1.length){
                s[k++]= s1[i++];
            }
            while(j<s2.length){
                s[k++]= s2[j++];
            }

    }
    public static void mergesort(int a[]){
        if(a.length<=1){
            return;
        }
        int mid = a.length/2;
        int b[]= new int[mid];
        int c[]= new int[a.length-mid];
        for(int i =0; i<mid;i++){
            b[i]=a[i];
        }
        for(int j =mid; j<a.length; j++){
            c[j-mid] = a[j];
        }
        mergesort(b);
        mergesort(c);
        merge(b,c,a);

    }
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        mergesort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
