package turmach.model;

public interface Observable {
    void addObserver(TMObserver o);
    void deleteObserver(TMObserver o);
}
