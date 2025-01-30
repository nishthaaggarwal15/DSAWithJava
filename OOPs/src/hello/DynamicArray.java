package hello;

public class DynamicArray {
    private int[] data;
    private int nextElementIndex;
    public  DynamicArray(){
        data = new int[5];
        nextElementIndex=0;
    }
    public int size(){
   return nextElementIndex;
    }
    public int get(int i ){
   if(i>=nextElementIndex){
        return -1 ;
   }
   return data[i];
    }
    public boolean isEmpty(){
        return nextElementIndex==0;
    }
    public int removeLast(){
if(nextElementIndex==0){
    return -1;
}
int temp = data[nextElementIndex-1];
data[nextElementIndex]=0;
nextElementIndex--;
return temp;
    }
    public void add (int element){
        if(nextElementIndex==data.length){
            doubleCapacity();
        }
data[nextElementIndex]= element;
nextElementIndex++;
    }
    public void set(int i, int element){
      data[i]= element;
    }
private void doubleCapacity(){
        int temp[]= data;
        data = new int[2*temp.length];
        for(int i =0; i<temp.length; i++){
            data[i]= temp[i];
        }
}
public void print(){
        for(int i =0; i<data.length; i++){
            System.out.print(data[i] +" ");
        }
}
}
