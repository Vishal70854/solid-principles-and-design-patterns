package design_patterns.structural.adapter_pattern;

public class DkCharger implements AndroidCharger{
    @Override
    public void chargeAndroidPhone() {
        System.out.println("your android phone is charging");
    }
}
