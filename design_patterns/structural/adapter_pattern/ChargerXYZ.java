package design_patterns.structural.adapter_pattern;

public class ChargerXYZ implements AppleCharger{
    @Override
    public void chargePhone() {
        System.out.println("your iphone is charging");
    }
}
