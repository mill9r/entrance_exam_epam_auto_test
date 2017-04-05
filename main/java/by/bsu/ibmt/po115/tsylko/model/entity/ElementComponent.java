package by.bsu.ibmt.po115.tsylko.model.entity;

/**
 * ClassName ElementComponent
 * This class is a base class in the composite pattern. This pattern allows to compose
 * objects into tree structures to represent part-whole hierarchies.
 * Version 1.00
 * Date 21.01.2017 Powered by Tsylko_Andrei
 */

public abstract class ElementComponent {
    public void addElement(ElementComponent part) {
        throw new UnsupportedOperationException();
    }

    ;

    public void removeElement(ElementComponent part) {
        throw new UnsupportedOperationException();
    }

    ;

    public ElementComponent getElement(int index) {
        throw new UnsupportedOperationException();
    }

    ;

    public ElementComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public void parse() {
        throw new UnsupportedOperationException();
    }

    ;

    public abstract void accept(Visitor visitor);
}