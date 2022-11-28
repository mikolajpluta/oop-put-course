public class Main {
    public static void main(String[] args) {

        int x = new NumberFunction(10, 20).min();

        Logharitm l = new Logharitm(1, 5);

        try{
            System.out.println(l.doubleValue());
        }catch(ArithmeticException ex){
            throw new IllegalArgumentException("illegal logarithm data", ex);
        }

        System.out.println(x);
    }
}