public class Main {
    public static void main(String[] args) {
        Euro value1 = new Euro(10);
        System.out.println("wartosc poczatkowa");
        System.out.println(value1.balance());

        Euro value2 = value1.addedCurrency(10, "USD");
        System.out.println("wartosc po dadaniu 10 usd");
        System.out.println(value2.balance());


        System.out.println("Hello world!");
    }
}