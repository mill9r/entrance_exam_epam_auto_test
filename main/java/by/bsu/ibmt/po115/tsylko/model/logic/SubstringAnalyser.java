package by.bsu.ibmt.po115.tsylko.model.logic;

import by.bsu.ibmt.po115.tsylko.controller.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ClassName SubstringAnalyzer
 * This class uses to check a substring with classes Pattern and Matcher/
 * Version 1.00
 * Date 22.01.2017 Powered by Tsylko_Andrei
 */
public class SubstringAnalyser {
    public static String checkWord(String word) {
        Pattern pattern = Pattern.compile("^.*" + Test.substring + "$");
        Matcher matcher = pattern.matcher(word.trim());
        if (matcher.find()) {
            return word + Test.word + " ";
        } else
            return word;
    }
}
