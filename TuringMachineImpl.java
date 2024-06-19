package turmach.model;

import java.util.List;

public class TuringMachineImpl implements RuleManagement, SymbolManagement, Observable {
    private List<Rule> ruleList;
    private List<Character> symbolList;

    @Override
    public List<Character> getSymbolList() {
        return symbolList;
    }

    @Override
    public char getBlankSymbol() {
        return ' ';
    }

    @Override
    public int getRuleCount() {
        return ruleList.size();
    }

    @Override
    public String getRuleState(int ruleNumber) {
        return ruleList.get(ruleNumber).initState();
    }

    @Override
    public char getRuleSymbol(int ruleNumber) {
        return ruleList.get(ruleNumber).initSymbol();
    }

    @Override
    public char getRuleNewSymbol(int ruleNumber) {
        return ruleList.get(ruleNumber).repSymbol();
    }

    @Override
    public Direction getRuleDirection(int ruleNumber) {
        return ruleList.get(ruleNumber).dir;
    }

    @Override
    public String getRuleNewState(int ruleNumber) {
        return ruleList.get(ruleNumber).newState();
    }

    @Override
    public void changeRule(int ruleNumber, String sourceState, char triggerSymbol, char replacementSymbol, Direction direction, String newState) {
        ruleList.set(ruleNumber, new Rule(sourceState, triggerSymbol, replacementSymbol, direction, newState));
    }

    @Override
    public void addRule(int ruleNumber, String sourceState, char triggerSymbol, char replacementSymbol, Direction direction, String newState) {
        ruleList.add(new Rule(sourceState, triggerSymbol, replacementSymbol, direction, newState));
    }

    @Override
    public void removeRule(int ruleNumber) {
        ruleList.remove(ruleNumber);
    }

    @Override
    public void addSymbol(char symbol) {
        symbolList.add(symbol);
    }

    @Override
    public void removeSymbol(char symbol) {
        symbolList.remove(symbol);
    }

    @Override
    public void addObserver(TMObserver o) {
        // Implementación
    }

    @Override
    public void deleteObserver(TMObserver o) {
        // Implementación
    }
}
