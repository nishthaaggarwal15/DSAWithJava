package hello;

public class DynamicArrayUse {
    public static void main(String[] args) {
        DynamicArray d = new DynamicArray();
        for(int i =0; i<100; i++){
            d.add(100+i);
        }
        System.out.println(d.get(99));
        System.out.println(d.size());
        d.set(101,123);
        d.removeLast();

        d.print();
        System.out.println();
        System.out.println(d.size());
    }

}
