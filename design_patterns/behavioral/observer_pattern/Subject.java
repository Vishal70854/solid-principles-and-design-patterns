package design_patterns.behavioral.observer_pattern;

public interface Subject {

    void subscribe(Observer ob);

    void unsubscribe(Observer ob);

    void notifyChanges(String title);

}
