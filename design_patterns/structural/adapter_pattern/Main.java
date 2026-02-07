package design_patterns.structural.adapter_pattern;

public class Main {
    public static void main(String[] args) {

        System.out.println("Adapter Design Pattern\n======================================");

        AppleCharger charger = new AdapterCharger(new DkCharger());

        Iphone13 iphone13 = new Iphone13(charger);
        iphone13.chargeIphone();

    }
}
