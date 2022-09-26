package hagers190220.hue2;

public class ComplexCalculator extends AbstractCalculator{
    public ComplexCalculator(CalcutionOperation add, CalcutionOperation sub, CalcutionOperation mult, CalcutionOperation div) {
        super(add, sub, mult, div);
    }

    @Override
    public Number add(Number x, Number y) {
        return new Number(x.getA()+y.getA(), x.getB()+y.getB());
    }

    @Override
    public Number subt(Number x, Number y) {
        return null;
    }

    @Override
    public Number mult(Number x, Number y) {
        return null;
    }

    @Override
    public Number divi(Number x, Number y) {
        return null;
    }
}
