
public class Main {



    public static void main(String[] args) {

        Calculator calc = new Calculator(1234);
        float result1 = calc.sum(1, 2);
        float result2 = calc.subtraction(5, 3);
        float result3 = calc.multiplication(10, 9);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}