package hagers190220.hue2;

public abstract class AbstractCalculator {

    protected CalcutionOperation add;
    protected CalcutionOperation sub;
    protected CalcutionOperation mult;
    protected CalcutionOperation div;

    public AbstractCalculator(CalcutionOperation add, CalcutionOperation sub, CalcutionOperation mult, CalcutionOperation div) {
        this.add = add;
        this.sub = sub;
        this.mult = mult;
        this.div = div;
    }

    public abstract Number add(Number x, Number y);
    public abstract Number subt(Number x, Number y);
    public abstract Number mult(Number x, Number y);
    public abstract Number divi(Number x, Number y);

}
