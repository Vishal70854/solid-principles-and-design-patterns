package design_patterns.structural.adapter_pattern;

public class Iphone13 {
    private AppleCharger appleCharger;

    public Iphone13(AppleCharger charger){
        this.appleCharger = charger;
    }

    public void chargeIphone(){
        appleCharger.chargePhone();
    }
}
