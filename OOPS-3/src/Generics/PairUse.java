package Generics;


public class PairUse {
    public static void main(String[] args) {
        // THIS IS FOR SINGLE DATA TYPE
//    Pair<String> ps = new Pair<String>("aa","bb");
//    Pair <Integer> is = new Pair<Integer>(2,3);
//    Pair <Double> ds = new Pair<Double>(2.3,4.3);
//        System.out.println(ps.getFirst() + " "+ ps.getSecond());
//        System.out.println(is.getFirst()+" "+ is.getSecond());
//        System.out.println(ds.getFirst()+" "+ ds.getSecond());
       // Pair <Vehicle> vs = new Pair<Vehicle>(new Vehicle(), new Vehicle()); we can do this as long as there is a subclass of name vehicle present here


//        // THIS IS FOR MULTIPLE DATA TYPE
//        Pair<String, Integer> ps = new Pair<String, Integer>("aa",5);

        // CREATING PAIR OF Pair (refer to diagram in notebook for better understanding)

        Pair<String, Integer> innerPair = new Pair<String, Integer>();
        innerPair.setFirst("abc");
        innerPair.setSecond(5);
        Pair<Pair<String,Integer>,String> p = new Pair<>();
        p.setFirst(innerPair);
        System.out.println(p.getFirst());// Pair's first refereing to inner pair we created
        System.out.println(p.getFirst().getFirst()); // pair's first is pointing to first of inner pair
        System.out.println(p.getFirst().getSecond()); // pair's second is pointing to second of inner pair

        p.setSecond("abs");
        System.out.println(p.getSecond());
    }
}
