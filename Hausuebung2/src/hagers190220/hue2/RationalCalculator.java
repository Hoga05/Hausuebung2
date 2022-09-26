package hagers190220.hue2;

public class RationalCalculator extends AbstractCalculator {
    public RationalCalculator() {
        super((x,y) -> {
            return new Number(x.getA()*y.getB()+(y.getA()*x.getB()), x.getB()*y.getB());
        }, (x,y) -> {
            return new Number(x.getA()*y.getB()-(y.getA()*x.getB()), x.getB()*y.getB());
        }, (x,y) -> {
            return new Number(x.getA()*y.getA(), x.getB()*y.getB());
        }, (x,y) -> new Number(x.getA()*y.getB(), x.getB()*x.getA()));
    }

    @Override
    public Number add(Number x, Number y) {
        return add.calc(x,y);
    }

    @Override
    public Number subt(Number x, Number y) {
        return sub.calc(x,y);
    }

    @Override
    public Number mult(Number x, Number y) {
        return mult.calc(x,y);
    }

    @Override
    public Number divi(Number x, Number y) {
       return div.calc(x,y);
    }
}
