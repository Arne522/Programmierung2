public class Beverage {
    String description;
    boolean mocha;
    boolean milk;
    boolean soy;
    boolean whip;

    public Beverage( boolean mocha, boolean milk, boolean soy, boolean whip) {
        this.description = "";
        this.mocha = mocha;
        this.milk = milk;
        this.soy = soy;
        this.whip = whip;
        if(whip){
            this.description += ", whip";
        }
        if (milk){
            this.description += ", milk";
        }
        if(soy){
            this.description += ", soy";
        }
        if(mocha){
            this.description +=", mocha";
        }
    }
    public double cost(){
        double cost = 0;
        if(milk){
            cost += 0.5;
        }
        if(whip){
            cost += 0.75;
        }
        if(soy){
            cost += 0.75;
        }
        if(mocha){
            cost += 1;
        }
        return cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean hasMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public boolean hasMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean hasSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean hasWhip() {
        return whip;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }
}
