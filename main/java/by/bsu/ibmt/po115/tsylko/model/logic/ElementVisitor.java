package by.bsu.ibmt.po115.tsylko.model.logic;

import by.bsu.ibmt.po115.tsylko.model.entity.Element;
import by.bsu.ibmt.po115.tsylko.model.entity.ElementItem;
import by.bsu.ibmt.po115.tsylko.model.entity.Visitor;
import by.bsu.ibmt.po115.tsylko.view.Printer;

import java.util.ArrayList;

/**
 * ClassName ElementVisitor
 * This class implements a visitor interface and add behaviors to entities classes
 * Version 1.00
 * Date 22.01.2017 Powered by Tsylko_Andrei
 */

public class ElementVisitor implements Visitor {
    @Override
    public void visit(Element element) {
    }

    @Override
    public void visit(ElementItem elementItem) {
        Printer.print(SubstringAnalyser.checkWord(elementItem.toString()));
    }
}

