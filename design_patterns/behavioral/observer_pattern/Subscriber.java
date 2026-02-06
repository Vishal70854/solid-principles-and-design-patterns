package design_patterns.behavioral.observer_pattern;

public class Subscriber implements Observer{

    String name;

    public String getName() {
        return name;
    }

    public Subscriber(String name){
        this.name = name;
    }

    @Override
    public void notified(String title) {
        System.out.println("Hello " + this.name + " new video upload : title => "+title);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Subscriber)) return false;
        Subscriber other = (Subscriber) obj;
        return name.equalsIgnoreCase(other.name);
    }

    @Override
    public int hashCode() {
        return name.toLowerCase().hashCode();
    }

}
