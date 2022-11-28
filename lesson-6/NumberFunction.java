public class NumberFunction {
    private int mx, mn;
    private float av;

    public NumberFunction(int a, int b){
        this.mx = a > b ? a : b;
        this.mn = a < b ? a : b;
        this.av = (a + b) / 2;
    }

    public int max(){
        return this.mx;
    }
    public int min(){
        return this.mn;
    }
    public float avg(){
        return this.av;
    }
}
