package turmach.model;

public class ConfigurationImpl implements StateConfiguration, PositionConfiguration, TapeConfiguration, Advanceable, EndConfiguration {
    private String state;
    private String tape;
    private int position;

    @Override
    public String getCurrentState() {
        return state;
    }

    @Override
    public int getCurrentPosition() {
        return position;
    }

    @Override
    public char getTapeCellSymbol(int position) {
        return ' ';
    }

    @Override
    public void changeTapeCell(int position, char newValue) {
        // Implementación
    }

    @Override
    public boolean canAdvance() {
        return false;
    }

    @Override
    public void advance() {
        // Implementación
    }

    @Override
    public int getLeftEnd() {
        return 0;
    }

    @Override
    public int getRightEnd() {
        return 0;
    }
}
