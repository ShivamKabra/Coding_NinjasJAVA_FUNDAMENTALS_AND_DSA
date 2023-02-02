package OOPS;

public class FractionUse {
    public static void main(String[] args)  {
        Fraction f1= new Fraction(20,30);
        f1.print();

        try{
            f1.setDenominator(0);
        }catch (ZeroDenominatorException e){
            System.out.println("hey dont input 0 as denominator");
        }

    }
}
