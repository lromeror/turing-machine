package turmach.model;

public interface RuleManagement {
    int getRuleCount();
    String getRuleState(int ruleNumber);
    char getRuleSymbol(int ruleNumber);
    char getRuleNewSymbol(int ruleNumber);
    Direction getRuleDirection(int ruleNumber);
    String getRuleNewState(int ruleNumber);
    void changeRule(int ruleNumber, String sourceState, char triggerSymbol, char replacementSymbol, Direction direction, String newState);
    void addRule(int ruleNumber, String sourceState, char triggerSymbol, char replacementSymbol, Direction direction, String newState);
    void removeRule(int ruleNumber);
}
