public class Calculator implements MathOperations{
    private int serialNumber = 3;
    @Override
    public float sum(float a, float b){
        return a + b;
    }

    @Override
    public float subtraction(float a, float b){return a - b;}

    @Override
    public float multiplication(float a, float b) {return a * b;}

    public Calculator(int serial_number){
        this.serialNumber = serial_number;
    }

}
