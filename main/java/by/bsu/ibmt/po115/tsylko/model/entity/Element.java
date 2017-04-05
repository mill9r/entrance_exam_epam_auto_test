package by.bsu.ibmt.po115.tsylko.model.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName Element
 * This class inherits a base class ElementComponent. This nodes class is define behavior
 * of the components having children and to store children components.
 * This class also overrides an accept() method, that give a link to node and children classes.
 * Version 1.00
 * Date 21.01.2017 Powered by Tsylko_Andrei
 */
public class Element extends ElementComponent {

    private List<ElementComponent> element;

    public Element() {
        element = new ArrayList<ElementComponent>();
    }

    public void addElement(ElementComponent part) {
        element.add(part);
    }

    public void removeElement(ElementComponent part) {
        element.remove(part);
    }

    public ElementComponent getElement(int index) {
        return element.get(index);
    }

    public void parse() {

    }

    private void acceptChildren(Visitor visitor) {
        for (int i = 0; i < element.size(); i++) {
            element.get(i).accept(visitor);
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        acceptChildren(visitor);
    }

    public ElementComponent getChild(int i) {
        return element.get(i);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (ElementComponent e : element) {
            stringBuilder.append(e + " ");
        }
        return stringBuilder.toString();
    }
}