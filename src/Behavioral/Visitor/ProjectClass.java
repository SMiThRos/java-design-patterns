package Behavioral.Visitor;

public class ProjectClass implements ProjectElement {
    @Override
    public void beWritted(Developer developer) {
        developer.create(this);
    }
}
