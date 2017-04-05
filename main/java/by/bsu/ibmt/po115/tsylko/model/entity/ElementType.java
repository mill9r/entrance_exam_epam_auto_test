package by.bsu.ibmt.po115.tsylko.model.entity;

/**
 * ClassName ElementType
 * This enum class provides some regex pattern for the regular expressions.
 * Version 1.00
 * Date 22.01.2017 Powered by Tsylko_Andrei
 */
public enum ElementType {
    SENTENCE(".*?[.!?]\\p{Blank}"),
    WORD(".*?\\s");
    private String reg;


    ElementType(String reg) {
        this.reg = reg;
    }

    public String getReg() {
        return reg;
    }
}
