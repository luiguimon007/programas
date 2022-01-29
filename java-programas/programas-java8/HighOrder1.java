import java.util.function.Function;

public class HighOrder1 {
    Function<Integer, Integer>add(final int x){
        Function<Integer, Integer> partialAdd = new Function<Integer, Integer>() {

            @Override
            public Integer apply(Integer t) {
                // TODO Auto-generated method stub
                return t+x;
            }    
        };
        return partialAdd;
    }
    public static void main(String[] args) {
        HighOrder1 h = new HighOrder1();
        Function<Integer,Integer>add10 = h.add(10);
        Function<Integer, Integer> add20 = h.add(20);

        System.out.println(add10.apply(5));
        System.out.println(add20.apply(5));

        
    }
}
