package turmach.model;

import java.util.List;

public interface SymbolManagement {
    List<Character> getSymbolList();
    char getBlankSymbol();
    void addSymbol(char symbol);
    void removeSymbol(char symbol);
}
