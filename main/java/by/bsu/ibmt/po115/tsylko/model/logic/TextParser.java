package by.bsu.ibmt.po115.tsylko.model.logic;

import by.bsu.ibmt.po115.tsylko.model.entity.Element;
import by.bsu.ibmt.po115.tsylko.model.entity.ElementComponent;
import by.bsu.ibmt.po115.tsylko.model.entity.ElementItem;
import by.bsu.ibmt.po115.tsylko.model.entity.ElementType;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ClassName TextParser
 * This class parses text to elements and add it to composite's nodes and leaves.
 * Version 1.02
 * Date 23.01.2017 Powered by Tsylko_Andrei
 */
public class TextParser {
    public ElementComponent parse(String text) {
        ElementComponent wholeText = new Element();
        wholeText = parseToSentence(wholeText, text);
        return wholeText;
    }

    private ElementComponent parseToSentence(ElementComponent wholeText, String text) {
        ElementComponent sentenceList = new Element();
        Pattern patternSentence = Pattern.compile(ElementType.SENTENCE.getReg());
        Matcher matcher = patternSentence.matcher(text);
        while (matcher.find()) {
            sentenceList = parseToWord(sentenceList, matcher.group());

        }
        wholeText.addElement(sentenceList);
        return wholeText;
    }

    private ElementComponent parseToWord(ElementComponent sentenceList, String text) {
        ElementComponent word;
        Pattern patternSentence = Pattern.compile(ElementType.WORD.getReg());
        Matcher matcher = patternSentence.matcher(text);
        while (matcher.find()) {
            word = new ElementItem(matcher.group());
            sentenceList.addElement(word);
        }
        return sentenceList;
    }

}
