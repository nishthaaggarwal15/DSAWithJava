package Generics;
// THIS TO IF WE WANT TO CREATE A OBJECT OF ONE DATA TYPE
//public class Pair <T>{
//private T first;
//private T second;
//public Pair(T first, T second){
//
//    this.first= first;
//    this.second= second;
//}
//public T getFirst(){
//    return first;
//}
//public void setFirst(T first){
//    this.first = first;
//}
//public T getSecond(){
//    return second;
//}
//public void setSecond(T second){
//    this.second= second;
//}
//}

// THIS IS FOR IF WE WANT ONE VARIABLE OF ONE DATATYPE AND ANOTHER ONE OF ANOTHER DATA TYPE
public class Pair <T, S>{
    private T first;
    private S second;
    public Pair(){

    }
    public Pair(T first, S second){

        this.first= first;
        this.second= second;
    }
    public T getFirst(){
        return first;
    }
    public void setFirst(T first){
        this.first = first;
    }
    public S getSecond(){
        return second;
    }
    public void setSecond(S second){
        this.second= second;
    }
}