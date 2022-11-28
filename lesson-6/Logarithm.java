public class Logarithm implements Number{
    private double base, argument;

    @Override
    public double doubleValue() throws ArithmeticException{
        if(this.argument <=0 || this.base <=0 || this.base == 1){
            throw new ArithmeticException("invalid logarithm format");
        }else{
          return Math.log(this.argument) / Math.log(this.base);
        }
    }
    public Logarithm(double inputBase, double inputArgument){
        this.base = inputBase;
        this.argument = inputArgument;
    }
}
