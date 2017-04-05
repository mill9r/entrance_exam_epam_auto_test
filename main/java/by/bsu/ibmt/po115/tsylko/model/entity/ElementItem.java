package by.bsu.ibmt.po115.tsylko.model.entity;

/**
 * ClassName ElementItem
 * This class inherits a base class ElementComponent. This class defines the behavior
 * for the elements in the composition. It does this by implementing the operations the Composite supports
 * This class also overrides an accept() method, that give a link to this classes.
 * Version 1.02
 * Date 21.01.2017 Powered by Tsylko_Andrei
 */
public class ElementItem extends ElementComponent {

    private String text;

    public ElementItem(String text) {
        this.text = text;
    }

    public ElementComponent getElement(int index) {
        return this;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return text;
    }

}

